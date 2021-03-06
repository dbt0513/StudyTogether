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
@TableName("userlog")
public class Userlog extends BaseEmtity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer type;

    private String content;

    private LocalDateTime createtime;

    private int uid;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
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
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
}
