package com.Response;

public class MultiResponse300 {
    private String message;
    private int code;
    public MultiResponse300() {
    }

    public MultiResponse300(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
