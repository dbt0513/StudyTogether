package com.taoge.common.vo;

import java.io.Serializable;

/**
 * @Author: taoge
 * @Date: 2019/1/15 9:44
 * @Version 1.0
 */
public class ResultVo implements Serializable {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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
}
