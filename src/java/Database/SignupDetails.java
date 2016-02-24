/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Ravindu
 */
public class SignupDetails {
    private String FIRST_NAME;
    private String LAST_NAME;
    private String EMAIL;
    private String GENDER;
    private String BIRTH_DAY;
    private String USER_ID;
    private String PASSWORD;

    /**
     * @return the FIRST_NAME
     */
    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    /**
     * @param FIRST_NAME the FIRST_NAME to set
     */
    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;  
        System.out.println(FIRST_NAME);
    }

    /**
     * @return the LAST_NAME
     */
    public String getLAST_NAME() {
        return LAST_NAME;
    }

    /**
     * @param LAST_NAME the LAST_NAME to set
     */
    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }


    /**
     * @return the PASSWORD
     */
    public String getPASSWORD() {
        return PASSWORD;
    }

    /**
     * @param PASSWORD the PASSWORD to set
     */
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    /**
     * @return the EMAIL
     */
    public String getEMAIL() {
        return EMAIL;
    }

    /**
     * @param EMAIL the EMAIL to set
     */
    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    /**
     * @return the GENDER
     */
    public String getGENDER() {
        return GENDER;
    }

    /**
     * @param GENDER the GENDER to set
     */
    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    /**
     * @return the BIRTH_DAY
     */
    public String getBIRTH_DAY() {
        return BIRTH_DAY;
    }

    /**
     * @param BIRTH_DAY the BIRTH_DAY to set
     */
    public void setBIRTH_DAY(String BIRTH_DAY) {
        this.BIRTH_DAY = BIRTH_DAY;
    }

    /**
     * @return the USER_ID
     */
    public String getUSER_ID() {
        return USER_ID;
    }

    /**
     * @param USER_ID the USER_ID to set
     */
    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }
}
