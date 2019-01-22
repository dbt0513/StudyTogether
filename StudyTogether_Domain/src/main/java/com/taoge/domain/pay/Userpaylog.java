package com.taoge.domain.pay;


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
@TableName("userpaylog")
public class Userpaylog extends BaseEmtity {

    private static final long serialVersionUID = 1L;
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer uoid;

    private Integer shell;

    private String content;

    private LocalDateTime createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUoid() {
        return uoid;
    }

    public void setUoid(Integer uoid) {
        this.uoid = uoid;
    }

    public Integer getShell() {
        return shell;
    }

    public void setShell(Integer shell) {
        this.shell = shell;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }
}
