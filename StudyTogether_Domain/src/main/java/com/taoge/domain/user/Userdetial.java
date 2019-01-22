package com.taoge.domain.user;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.taoge.domain.base.BaseEmtity;

import java.time.LocalDate;

/**
 * @Author: taoge
 * @Date: 2019/1/16 12:15
 * @Version 1.0
 */
@TableName("userdetial")
public class Userdetial extends BaseEmtity {
    private static final long serialVersionUID = 1L;
    @TableId(value = "uid")
    private Integer uid;

    private String nickname;

    private Integer sex;

    private LocalDate birthday;

    private String headimg;

    private String sign;

    private String email;

    private String recode;

    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Integer getSex() {
        return sex;
    }
    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public String getHeadimg() {
        return headimg;
    }
    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRecode() {
        return recode;
    }
    public void setRecode(String recode) {
        this.recode = recode;
    }
}
