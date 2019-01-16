package com.taoge.common.token;

import java.time.LocalDateTime;

/**
 * @Author: taoge
 * @Date: 2019/1/16 11:35
 * @Version 1.0
 */
public class LoginToken {
    private int id;//记录用户id
    private Object user;//记录当前的登录用户
    private LocalDateTime createtime;//最后一次访问时间
    private long randomnum;//随机数

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public long getRandomnum() {
        return randomnum;
    }

    public void setRandomnum(long randomnum) {
        this.randomnum = randomnum;
    }
}
