package com.taoge.wochat;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author: taoge
 * @Date: 2019/1/19 10:22
 * @Version 1.0
 */
public class ChatVo {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Date getCdatetime() {
        return cdatetime;
    }

    public void setCdatetime(Date cdatetime) {
        this.cdatetime = cdatetime;
    }
    private int type;//1、表示用户 2表示客服

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private String msg;
    private String imgurl;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date cdatetime;

    public ChatVo(int id,int type, String msg, String imgurl, Date cdatetime) {
        this.id = id;
        this.msg = msg;
        this.type=type;
        this.imgurl = imgurl;
        this.cdatetime = cdatetime;
    }

    public ChatVo() {

    }
}
