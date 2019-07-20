package com.caoyang.dto;

import java.util.List;

public class GetAll {

    private Integer code;

    private String msg;

    private Object data;

    private Object extra;

    public GetAll() {
    }

    public GetAll(Integer code, String msg, Object data, Object extra) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.extra = extra;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Integer getCode() {

        return code;
    }

    public void setCode(Integer stat) {
        this.code = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetAll{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", extra=" + extra +
                '}';
    }
}
