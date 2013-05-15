
package jp.sumasu.imasdb.example.pojo;

import java.io.Serializable;

/**
 * API呼び出しの結果用POJO
 * 
 * @author ryosms
 */
public class ApiResult implements Serializable {

    private static final long serialVersionUID = -2929025445944212204L;
    private int code;
    private String msg;

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}
