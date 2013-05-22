
package jp.sumasu.imasdb.example.pojo;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

/**
 * キャラクター1人分のPOJO
 * 
 * @author ryosms
 */
public class Character implements Serializable {
    private static final long serialVersionUID = -6852842252271617384L;

    private int id;
    private String name;
    @SerializedName("name_ruby")
    private String nameRuby;
    @SerializedName("family_name")
    private String familyName;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("family_name_ruby")
    private String familyNameRuby;
    @SerializedName("first_name_ruby")
    private String firstNameRuby;
    @SerializedName("is_foreigner_name")
    private boolean isForeignerName;
    @SerializedName("birth_month")
    private int birthMonth;
    @SerializedName("birth_day")
    private int birthDay;
    private int gender;
    @SerializedName("is_idol")
    private boolean isIdol;
    @SerializedName("character_type")
    private int characterType;
    @SerializedName("arrival_date")
    private String arrivalDate;
    @SerializedName("origin_media")
    private String originMedia;
    private String cv;
    @SerializedName("class_name")
    private String className;
    @SerializedName("profile_list")
    private Profile[] profileList;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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

    /**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * @param familyName the familyName to set
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the familyNameRuby
     */
    public String getFamilyNameRuby() {
        return familyNameRuby;
    }

    /**
     * @param familyNameRuby the familyNameRuby to set
     */
    public void setFamilyNameRuby(String familyNameRuby) {
        this.familyNameRuby = familyNameRuby;
    }

    /**
     * @return the firstNameRuby
     */
    public String getFirstNameRuby() {
        return firstNameRuby;
    }

    /**
     * @param firstNameRuby the firstNameRuby to set
     */
    public void setFirstNameRuby(String firstNameRuby) {
        this.firstNameRuby = firstNameRuby;
    }

    /**
     * @return the isForeignerName
     */
    public boolean isForeignerName() {
        return isForeignerName;
    }

    /**
     * @param isForeignerName the isForeignerName to set
     */
    public void setForeignerName(boolean isForeignerName) {
        this.isForeignerName = isForeignerName;
    }

    /**
     * @return the birthMonth
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * @param birthMonth the birthMonth to set
     */
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    /**
     * @return the birthDay
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return the isIdol
     */
    public boolean isIdol() {
        return isIdol;
    }

    /**
     * @param isIdol the isIdol to set
     */
    public void setIdol(boolean isIdol) {
        this.isIdol = isIdol;
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
     * @return the arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * @param arrivalDate the arrivalDate to set
     */
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /**
     * @return the originMedia
     */
    public String getOriginMedia() {
        return originMedia;
    }

    /**
     * @param originMedia the originMedia to set
     */
    public void setOriginMedia(String originMedia) {
        this.originMedia = originMedia;
    }

    /**
     * @return the cv
     */
    public String getCv() {
        return cv;
    }

    /**
     * @param cv the cv to set
     */
    public void setCv(String cv) {
        this.cv = cv;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the profileList
     */
    public Profile[] getProfileList() {
        return profileList;
    }

    /**
     * @param profileList the profileList to set
     */
    public void setProfileList(Profile[] profileList) {
        this.profileList = profileList;
    }

    /**
     * キャラクターのJSONに含まれる詳細プロフィール用POJO
     * 
     * @author ryosms
     */
    public static class Profile implements Serializable {
        private static final long serialVersionUID = -1712921735583276149L;

        private int generation;
        private int age;
        private int height;
        private int weight;
        private int bust;
        private int waist;
        private int hip;
        private String bloodType;
        @SerializedName("dominant_hand")
        private String dominantHand;
        private String hometown;
        private String hobby;
        private String specialty;
        private String favorite;
        private String memo;
        @SerializedName("last_update")
        private String lastUpdate;

        /**
         * @return the generation
         */
        public int getGeneration() {
            return generation;
        }

        /**
         * @param generation the generation to set
         */
        public void setGeneration(int generation) {
            this.generation = generation;
        }

        /**
         * @return the age
         */
        public int getAge() {
            return age;
        }

        /**
         * @param age the age to set
         */
        public void setAge(int age) {
            this.age = age;
        }

        /**
         * @return the height
         */
        public int getHeight() {
            return height;
        }

        /**
         * @param height the height to set
         */
        public void setHeight(int height) {
            this.height = height;
        }

        /**
         * @return the weight
         */
        public int getWeight() {
            return weight;
        }

        /**
         * @param weight the weight to set
         */
        public void setWeight(int weight) {
            this.weight = weight;
        }

        /**
         * @return the bust
         */
        public int getBust() {
            return bust;
        }

        /**
         * @param bust the bust to set
         */
        public void setBust(int bust) {
            this.bust = bust;
        }

        /**
         * @return the waist
         */
        public int getWaist() {
            return waist;
        }

        /**
         * @param waist the waist to set
         */
        public void setWaist(int waist) {
            this.waist = waist;
        }

        /**
         * @return the hip
         */
        public int getHip() {
            return hip;
        }

        /**
         * @param hip the hip to set
         */
        public void setHip(int hip) {
            this.hip = hip;
        }

        /**
         * @return the bloodType
         */
        public String getBloodType() {
            return bloodType;
        }

        /**
         * @param bloodType the bloodType to set
         */
        public void setBloodType(String bloodType) {
            this.bloodType = bloodType;
        }

        /**
         * @return the dominantHand
         */
        public String getDominantHand() {
            return dominantHand;
        }

        /**
         * @param dominantHand the dominantHand to set
         */
        public void setDominantHand(String dominantHand) {
            this.dominantHand = dominantHand;
        }

        /**
         * @return the hometown
         */
        public String getHometown() {
            return hometown;
        }

        /**
         * @param hometown the hometown to set
         */
        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        /**
         * @return the hobby
         */
        public String getHobby() {
            return hobby;
        }

        /**
         * @param hobby the hobby to set
         */
        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        /**
         * @return the specialty
         */
        public String getSpecialty() {
            return specialty;
        }

        /**
         * @param specialty the specialty to set
         */
        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        /**
         * @return the favorite
         */
        public String getFavorite() {
            return favorite;
        }

        /**
         * @param favorite the favorite to set
         */
        public void setFavorite(String favorite) {
            this.favorite = favorite;
        }

        /**
         * @return the memo
         */
        public String getMemo() {
            return memo;
        }

        /**
         * @param memo the memo to set
         */
        public void setMemo(String memo) {
            this.memo = memo;
        }

        /**
         * @return the lastUpdate
         */
        public String getLastUpdate() {
            return lastUpdate;
        }

        /**
         * @param lastUpdate the lastUpdate to set
         */
        public void setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
        }

    }

}
