package com.taoge.service.video;

import com.taoge.common.qo.QueryParam;
import com.taoge.common.vo.PageVo;
import com.taoge.common.vo.ResultVo;
import com.taoge.domain.user.Userappraise;
import com.taoge.domain.video.Video;
import com.taoge.domain.video.Videocourse;

/**
 * @Author: taoge
 * @Date: 2019/1/21 21:27
 * @Version 1.0
 */
public interface VideoService  {
    //查询视频语言
    ResultVo queryType();
    //查询语言对应的知识点
    ResultVo queryPoint(int tid);
    //新增视频课程
    ResultVo saveCourse(Videocourse videocourse);
    //查询视频专题 根据语言查询分页
    PageVo<Videocourse> queryByPage(QueryParam queryParam);
    //新增视频
    ResultVo saveVideo(Video video);
    //查询课程下的所有视频
    ResultVo queryByCourse(int vcid);
    //查询具体视频
    ResultVo queryById(int vid);
    //查询主页显示内容 最新更新 大家喜欢 热销榜单
    ResultVo queryIndex();
    //加载该视频下所有评价内容
    PageVo<Userappraise> queryApprasise(QueryParam queryParam);
    //加载该视频下所有评价内容
    PageVo<Userappraise> queryVcApprasise(QueryParam queryParam);

}
