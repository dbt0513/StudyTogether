package com.taoge.wochat;

/**
 * @Author: taoge
 * @Date: 2019/1/19 10:23
 * @Version 1.0
 */
public class SocketMain {
    public static void main(String[] args) {
        ChatWsServer server=new ChatWsServer(7676);
        server.start();
        System.out.println("在线客服系统运行中……");
    }
}
