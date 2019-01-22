package com.taoge.dao.video;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.taoge.domain.video.Video;
import com.taoge.domain.video.Videocourse;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: taoge
 * @Date: 2019/1/21 21:18
 * @Version 1.0
 */
public interface VideoCourseDao extends BaseMapper<Videocourse> {
    @Select("select vc.*,vco.vccount from videocourse vc INNER join (select count(vcid) vccount,vcid from userorder group by vcid order by vccount desc limit 12)vco on vc.id=vco.vcid")
    @ResultType(Videocourse.class)
    List<Videocourse> queryCourse();
    @Select("select vc.* from videocourse vc inner join userorder uo on vc.id=uo.vcid where uo.uid=#{uid} and uo.flag=2")
    @ResultType(Videocourse.class)
    List<Videocourse> queryBuyCourse(int uid);
}
