
package jp.sumasu.imasdb.example;

import jp.sumasu.imasdb.example.pojo.Character;
import jp.sumasu.imasdb.example.pojo.CharacterList;
import android.widget.ArrayAdapter;

import com.actionbarsherlock.app.SherlockListFragment;
import com.googlecode.androidannotations.annotations.AfterInject;
import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.EFragment;
import com.googlecode.androidannotations.annotations.FragmentArg;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.rest.RestService;

/**
 * キャラクター一覧をリスト表示するFragment
 * 
 * @author ryosms
 */
@EFragment
public class CharacterListFragment extends SherlockListFragment {

    @RestService
    ImasDbApis imasDbApis;

    @FragmentArg
    protected int type;

    @FragmentArg
    protected boolean includeProfile;

    @AfterInject
    protected void initFragment() {
        startSearch();
    }

    @Background
    protected void startSearch() {
        CharacterList characters = imasDbApis.getCharacterList(type, includeProfile);
        setListData(characters);
    }

    @UiThread
    protected void setListData(CharacterList characters) {
        if (characters.getResult().getCode() != 200) {
            setEmptyText(characters.getResult().getMsg());
            return;
        }
        if (characters.getCharacterList().length == 0) {
            setEmptyText("Empty");
            return;
        }
        // TODO: カスタムレイアウト & カスタムAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1);
        for (Character character : characters.getCharacterList()) {
            adapter.add(character.getName());
        }
        setListAdapter(adapter);
    }

}
