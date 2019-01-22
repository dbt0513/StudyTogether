package com.taoge.websockteserver;

import org.java_websocket.WebSocketImpl;

/**
 * @Author: taoge
 * @Date: 2019/1/19 17:03
 * @Version 1.0
 */
public class My_Main {
    public static void main(String[] args) {
        WebSocketImpl.DEBUG=false;
        WsServer wsServer=new WsServer(7676);
        wsServer.start();


    }
}
