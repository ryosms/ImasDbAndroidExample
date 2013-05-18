
package jp.sumasu.imasdb.example.pojo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * キャラクタータイプ（分類）用POJO
 * 
 * @author ryosms
 */
public class CharacterTypeList implements Serializable {

    private static final long serialVersionUID = -4508691719567193402L;

    private ApiResult result;
    @SerializedName("character_type_list")
    private CharacterType[] characterTypeList;

    /**
     * @return the result
     */
    public ApiResult getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(ApiResult result) {
        this.result = result;
    }

    /**
     * @return the characterTypeList
     */
    public CharacterType[] getCharacterTypeList() {
        return characterTypeList;
    }

    /**
     * @param characterTypeList the characterTypeList to set
     */
    public void setCharacterTypeList(CharacterType[] characterTypeList) {
        this.characterTypeList = characterTypeList;
    }

    public static class CharacterType implements Serializable {

        private static final long serialVersionUID = -8332436044450551869L;

        private int type;

        private String name;

        /**
         * @return the type
         */
        public int getType() {
            return type;
        }

        /**
         * @param type the type to set
         */
        public void setType(int type) {
            this.type = type;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

    }

}
