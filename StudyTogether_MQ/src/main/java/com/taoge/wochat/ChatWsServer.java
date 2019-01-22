package com.taoge.wochat;

import com.alibaba.fastjson.JSON;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.Date;
import java.util.Objects;

/**
 * @Author: taoge
 * @Date: 2019/1/19 10:23
 * @Version 1.0
 */
public class ChatWsServer extends WebSocketServer {
    public ChatWsServer(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {

    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {

    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        System.out.println("收到消息："+s);
        String res=s;
        if(s.trim().startsWith("role:")){
            //第一次连接
            if(Objects.equals(s.trim(),"role:emp")){
                //客服
                SystemCon.emps.add(webSocket);
                System.out.println("客服上线……");
                res="欢迎你，希望用饱满热情，对待每一个用户";
                webSocket.send(JSON.toJSONString(new ChatVo(SystemCon.ID++,1,res,"img/timg.jpg",new Date())));
            }else if(Objects.equals(s.trim(),"role:user")){
                //用户
                SystemCon.users.add(webSocket);
                SystemCon.randomKf(webSocket);
                res="客服MM已经在线,你想咨询什么？";
                webSocket.send(JSON.toJSONString(new ChatVo(SystemCon.ID++,1,res,"img/a.jpg",new Date())));
            }
        }else{
            if(webSocket==SystemCon.kf){
                //客服发的消息---转发给用户

                SystemCon.refs.get(SystemCon.kf).send(
                        JSON.toJSONString(new ChatVo(SystemCon.ID++,1,s,"img/a.jpg",new Date())));
            }else{
                //用户发的消息---转发给客服
                SystemCon.kf.send(JSON.toJSONString(new ChatVo(SystemCon.ID++,1,s,"img/timg.jpg",new Date())));
            }
        }

    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {

    }

    @Override
    public void onStart() {

    }
}
