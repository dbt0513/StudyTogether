package com.taoge.domain.video;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.taoge.domain.base.BaseEmtity;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author java1806
 * @since 2019-01-21
 */

@TableName("video")
public class Video extends BaseEmtity{

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer vcid;

    private String name;

    private String videourl;

    private Integer vpid;

    private LocalDateTime createtime;

    private LocalDateTime endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVcid() {
        return vcid;
    }

    public void setVcid(Integer vcid) {
        this.vcid = vcid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public Integer getVpid() {
        return vpid;
    }

    public void setVpid(Integer vpid) {
        this.vpid = vpid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }
}
