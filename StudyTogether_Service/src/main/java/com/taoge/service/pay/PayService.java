package com.taoge.service.pay;

import com.taoge.common.vo.PageVo;
import com.taoge.common.vo.ResultVo;
import com.taoge.domain.pay.Paycode;
import com.taoge.domain.pay.Userorder;
import com.taoge.domain.pay.Userpaylog;
import com.taoge.domain.user.Usershell;
import com.taoge.domain.video.Videocourse;

/**
 * @Author: taoge
 * @Date: 2019/1/21 21:39
 * @Version 1.0
 */
public interface PayService {
    //下单   订购视频课程
    ResultVo saveOrder(Userorder userorder);
    //充值   涉及支付
    ResultVo savePayCode(Paycode paycode);
    //充值回调 更新支付结果
    ResultVo updatePay(int oid, int flag);
    //我的充值记录
    ResultVo queryPayLog(String token);
    //我的课程
    ResultVo queryCourse(String token);
    //我的消费清单
    ResultVo queryShell(String token);
    //
}
