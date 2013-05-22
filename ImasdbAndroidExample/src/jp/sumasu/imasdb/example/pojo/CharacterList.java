
package jp.sumasu.imasdb.example.pojo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * キャラクター一覧用POJO
 * 
 * @author ryosms
 */
public class CharacterList implements Serializable {
    private static final long serialVersionUID = -222507192180296343L;

    private ApiResult result;
    @SerializedName("character_type")
    private int characterType;
    @SerializedName("character_type_label")
    private String characterTypeLabel;
    @SerializedName("character_list")
    private Character[] characterList;

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
     * @return the characterType
     */
    public int getCharacterType() {
        return characterType;
    }

    /**
     * @param characterType the characterType to set
     */
    public void setCharacterType(int characterType) {
        this.characterType = characterType;
    }

    /**
     * @return the characterTypeLabel
     */
    public String getCharacterTypeLabel() {
        return characterTypeLabel;
    }

    /**
     * @param characterTypeLabel the characterTypeLabel to set
     */
    public void setCharacterTypeLabel(String characterTypeLabel) {
        this.characterTypeLabel = characterTypeLabel;
    }

    /**
     * @return the characterList
     */
    public Character[] getCharacterList() {
        return characterList;
    }

    /**
     * @param characterList the characterList to set
     */
    public void setCharacterList(Character[] characterList) {
        this.characterList = characterList;
    }

}
