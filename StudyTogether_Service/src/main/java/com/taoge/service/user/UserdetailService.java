package com.taoge.service.user;

import com.taoge.common.vo.ResultVo;
import com.taoge.domain.user.Userdetial;

/**
 * @Author: taoge
 * @Date: 2019/1/17 16:55
 * @Version 1.0
 */
public interface UserdetailService {

    //个人资料
    ResultVo update(String token, Userdetial userdetial);
    //查询个人详情
    ResultVo queryById(String token);
}
