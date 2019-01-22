package com.taoge.common.util;

/**
 * @Author: taoge
 * @Date: 2019/1/22 11:30
 * @Version 1.0
 */
public class StringUtil {
    //空返回true 不空返回false
    public static boolean isEmpty(String... vls){
        for(String v:vls){
            if(v!=null && v.length()>0){
                return false;
            }
        }
        return true;
    }
}
