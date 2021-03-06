package com.taoge.service.user;

import com.taoge.common.vo.PageVo;
import com.taoge.common.vo.ResultVo;
import com.taoge.domain.user.User;
import com.taoge.domain.user.Userappraise;

/**
 * @Author: taoge
 * @Date: 2019/1/14 21:23
 * @Version 1.0
 */
public interface UserService {
    //注册
    ResultVo save(User user);
    //校验手机
    ResultVo checkPhone(String phone);
    //登录-前后端分离
    ResultVo login(String phone,String password);
    //退出
    ResultVo loginout(String token);
    //查询主页内容
    ResultVo queryHome(String token);
    //用户评价
    ResultVo savaAooraise(Userappraise userappraise);
    //生成推荐的专属海报
    ResultVo createRec(String token);
}
