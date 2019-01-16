package com.taoge.domain.user;

import com.taoge.domain.base.BaseEmtity;

/**
 * @Author: taoge
 * @Date: 2019/1/15 9:36
 * @Version 1.0
 */
public class User extends BaseEmtity {
    private int id;
    private String phone;
    private String password;
    private int flag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
