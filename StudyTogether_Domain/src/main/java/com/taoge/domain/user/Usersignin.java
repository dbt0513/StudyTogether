package com.taoge.domain.user;

import com.taoge.domain.base.BaseEmtity;

import java.time.LocalDateTime;

/**
 * @Author: taoge
 * @Date: 2019/1/16 12:12
 * @Version 1.0
 */
public class Usersignin extends BaseEmtity {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer uid;

    private LocalDateTime signintime;

    private Integer shell;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public LocalDateTime getSignintime() {
        return signintime;
    }
    public void setSignintime(LocalDateTime signintime) {
        this.signintime = signintime;
    }
    public Integer getShell() {
        return shell;
    }
    public void setShell(Integer shell) {
        this.shell = shell;
    }
}
