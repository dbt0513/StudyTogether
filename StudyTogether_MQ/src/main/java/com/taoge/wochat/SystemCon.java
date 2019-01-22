package com.taoge.wochat;

import org.java_websocket.WebSocket;

import java.util.*;

/**
 * @Author: taoge
 * @Date: 2019/1/19 10:22
 * @Version 1.0
 */
public class SystemCon {
    public static int ID=1;
    public static List<WebSocket> users;
    public static List<WebSocket> emps;
    public static WebSocket kf;
    public static Map<WebSocket,WebSocket> refs;//键记录客服  值记录用户
    static {
        users=new ArrayList<>();
        emps=new ArrayList<>();
        refs=new LinkedHashMap<>();
    }
    //随机分配客服
    public static void randomKf(WebSocket webSocket){
        kf=emps.get(new Random().nextInt(emps.size()));
        refs.put(kf,webSocket);//分配客服
    }
}
