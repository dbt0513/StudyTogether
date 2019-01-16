package com.taoge.service.user;

import com.taoge.common.vo.ResultVo;

/**
 * @Author: taoge
 * @Date: 2019/1/16 14:44
 * @Version 1.0
 */
public interface UserSigninService {
    //签到
    ResultVo signin(String token);
    //校验是否可以签到
    ResultVo checkSign(String token);
    //查询签到记录
    ResultVo queryList(String token,int count);
}
