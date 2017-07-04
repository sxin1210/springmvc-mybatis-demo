package com.test.userinfo.entity;

/**
 * Created by songxin07 on 17/6/23.
 */
public class Response {
    private int code;
    private Object data;
    private String msg;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Response[ code="+ code + ", msg="+ msg+"Object=" + data+"]";
    }
}
