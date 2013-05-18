
package jp.sumasu.imasdb.example;

import jp.sumasu.imasdb.example.pojo.CharacterTypeList;

import org.springframework.http.converter.json.GsonHttpMessageConverter;

import com.googlecode.androidannotations.annotations.rest.Get;
import com.googlecode.androidannotations.annotations.rest.Rest;

/**
 * アイマスDBのAPIを叩く用のinterface
 * 
 * @author ryosms
 */
@Rest(rootUrl = "http://api.imas-db.jp/", converters = {
        GsonHttpMessageConverter.class
})
public interface ImasDbApis {

    /**
     * キャラクタータイプ（分類）取得
     * 
     * @return
     */
    @Get("character/type/list?format=list")
    CharacterTypeList getCharacterTypeList();

}
