
package jp.sumasu.imasdb.example;

import jp.sumasu.imasdb.example.pojo.CharacterTypeList;
import jp.sumasu.imasdb.example.pojo.CharacterTypeList.CharacterType;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.OnNavigationListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.rest.RestService;

@EActivity(R.layout.activity_main)
public class MainActivity
        extends SherlockFragmentActivity
        implements OnNavigationListener
{

    @ViewById
    TextView hello;
    @ViewById(R.id.search_layout)
    LinearLayout searchLayout;
    @ViewById(R.id.chara_type)
    Spinner characterType;
    @ViewById(R.id.main_frame)
    FrameLayout mainFrame;

    CharacterType[] mCharacterTypeList;

    @RestService
    ImasDbApis imasDbApis;

    @AfterViews
    void afterViews() {
        configureActionBar();

        getCharacterTypes();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater();
        return true;
    }

    private void configureActionBar() {
        Context context = getSupportActionBar().getThemedContext();
        ArrayAdapter<CharSequence> list = ArrayAdapter.createFromResource(context,
                R.array.locations, (android.R.layout.simple_list_item_1));
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
        getSupportActionBar().setListNavigationCallbacks(list, this);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        return true;
    }

    /**
     * APIよりキャラクタータイプを取得する
     */
    @Background
    protected void getCharacterTypes() {
        CharacterTypeList charaType = imasDbApis.getCharacterTypeList();
        // FIXME: magic number
        if (charaType.getResult().getCode() != 200) {
            setText(charaType.getResult().getMsg());
            return;
        }
        setCharacterType(charaType.getCharacterTypeList());
    }

    @UiThread
    protected void setText(String msg) {
        hello.setText(msg);
    }

    /**
     * Spinnerに取得したキャラクタータイプをセットする
     * 
     * @param list
     */
    @UiThread
    protected void setCharacterType(CharacterType[] list) {
        mCharacterTypeList = list;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item);
        for (CharacterType type : list) {
            adapter.add(type.getName());
        }
        characterType.setAdapter(adapter);
        searchLayout.setVisibility(View.VISIBLE);

        // TODO: キャッシュ処理入れてもいいかもね
    }

    @Click(R.id.search_button)
    protected void onClickSearch() {
        hello.setVisibility(View.GONE);
        mainFrame.setVisibility(View.VISIBLE);
        final int pos = characterType.getSelectedItemPosition();
        int type = 0;
        if (pos >= 0 && pos < mCharacterTypeList.length) {
            type = mCharacterTypeList[pos].getType();
        }
        CharacterListFragment fragment = CharacterListFragment_.builder().type(type)
                .includeProfile(false).build();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.main_frame, fragment);
        ft.commit();
    }

}
