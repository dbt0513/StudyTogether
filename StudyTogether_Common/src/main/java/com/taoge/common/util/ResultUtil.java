package com.taoge.common.util;

import com.taoge.common.vo.PageVo;
import com.taoge.common.vo.ResultVo;

import java.util.List;

/**
 * @Author: taoge
 * @Date: 2019/1/15 10:05
 * @Version 1.0
 */
public class ResultUtil {
    //一般都是新增或修改或删除操作
    public static ResultVo exec(int count, Object obj) {
        ResultVo resultVo = new ResultVo();
        if(count > 0) {
            resultVo.setCode(1);
            resultVo.setMsg("操作成功");
            resultVo.setData(obj);
        }else {
            resultVo.setCode(1001);
            resultVo.setMsg("操作失败");
        }
        return resultVo;
    }
    public static ResultVo execOK(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        return resultVo;
    }
    public static ResultVo execERROR(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1002);
        resultVo.setMsg("ERROR");
        return resultVo;
    }
    public static ResultVo execOK(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        resultVo.setData(obj);
        return resultVo;
    }
    public static ResultVo execERROR(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1002);
        resultVo.setMsg("ERROR");
        resultVo.setData(obj);
        return resultVo;
    }
    public static <T> PageVo<T> execPage(int page, int size,int count, List<T>data){
        PageVo<T> vo = new PageVo<>();
        vo.setData(data);
        vo.setCurrpage(page);
        vo.setSize(size);
        vo.setCount(count);
        return vo;
    }
}
