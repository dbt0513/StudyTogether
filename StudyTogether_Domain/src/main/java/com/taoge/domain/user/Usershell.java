package com.taoge.domain.user;

import com.taoge.domain.base.BaseEmtity;

import java.time.LocalDate;

/**
 * @Author: taoge
 * @Date: 2019/1/16 12:13
 * @Version 1.0
 */
public class Usershell extends BaseEmtity {
    private Long id;

    private Integer shell;

    private LocalDate startdate;

    private LocalDate enddate;

    private Integer type;

    private Integer uid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getShell() {
        return shell;
    }
    public void setShell(Integer shell) {
        this.shell = shell;
    }
    public LocalDate getStartdate() {
        return startdate;
    }
    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }
    public LocalDate getEnddate() {
        return enddate;
    }
    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
