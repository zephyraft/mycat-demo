package org.zephyr.sharding.common;

/**
 * Created by zephyr on 2018/9/5.
 */
@SuppressWarnings({"WeakerAccess"})
public class DataResult {
    private int code;

    private String message;

    private Object data;

    public DataResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public DataResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
