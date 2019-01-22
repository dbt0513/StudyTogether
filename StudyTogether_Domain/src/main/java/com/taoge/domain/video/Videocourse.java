package com.taoge.domain.video;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.taoge.domain.base.BaseEmtity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-21
 */
@TableName("videocourse")
public class Videocourse extends BaseEmtity {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer aid;

    private Integer count;

    private Integer shell;

    private Integer currshell;

    private String fit;

    private LocalDateTime createtime;

    private String name;

    private Integer vtid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getShell() {
        return shell;
    }

    public void setShell(Integer shell) {
        this.shell = shell;
    }

    public Integer getCurrshell() {
        return currshell;
    }

    public void setCurrshell(Integer currshell) {
        this.currshell = currshell;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVtid() {
        return vtid;
    }

    public void setVtid(Integer vtid) {
        this.vtid = vtid;
    }
}
