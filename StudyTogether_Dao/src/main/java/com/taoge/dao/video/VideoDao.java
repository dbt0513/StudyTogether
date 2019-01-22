package com.taoge.dao.video;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.taoge.domain.video.Video;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: taoge
 * @Date: 2019/1/21 20:10
 * @Version 1.0
 */
public interface VideoDao extends BaseMapper<Video> {
    @Select("select v.*,vc.vcount from video v INNER join (select count(vid) vcount,vid from userplay group by vid order by vcount desc limit 12) vc on v.id=vc.vid")
    @ResultType(Video.class)
    List<Video> queryPlay();

}
