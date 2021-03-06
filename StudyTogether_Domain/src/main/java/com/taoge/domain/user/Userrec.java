package com.taoge.domain.user;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.taoge.domain.base.BaseEmtity;

import java.time.LocalDateTime;

/**
 * @Author: taoge
 * @Date: 2019/1/16 12:14
 * @Version 1.0
 */
@TableName("userrec")
public class Userrec extends BaseEmtity {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer touid;

    private Integer beuid;

    private Integer shell;

    private LocalDateTime createtime;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getTouid() {
        return touid;
    }
    public void setTouid(Integer touid) {
        this.touid = touid;
    }
    public Integer getBeuid() {
        return beuid;
    }
    public void setBeuid(Integer beuid) {
        this.beuid = beuid;
    }
    public Integer getShell() {
        return shell;
    }
    public void setShell(Integer shell) {
        this.shell = shell;
    }
    public LocalDateTime getCreatetime() {
        return createtime;
    }
    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
}
