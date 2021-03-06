package com.taoge.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: taoge
 * @Date: 2019/1/19 16:58
 * @Version 1.0
 */
public class ReceiveMsg2 {
    public static void main(String[] args) throws IOException, TimeoutException {
        //1、创建工厂
        ConnectionFactory connectionFactory=new ConnectionFactory();
        //2、设置连接信息
        connectionFactory.setHost("39.105.189.141");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        //3、获取连接对象
        Connection connection=connectionFactory.newConnection();
        //4、创建通道对象
        Channel channel=connection.createChannel();
        //5、创建消息存储对象
        /**
         * 参数说明：
         * 1、队列名称
         * 2、是否持久化
         * 3、是否独占队列
         * 4、断开之后是否自动删除消息
         * 5、参数信息*/
        channel.queueDeclare("ZZ1806",false,false,false,null);
        //6、发送消息
        Consumer consumer=new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg=new String(body);
                System.out.println("2个获取消息："+msg);
            }
        };
        channel.basicConsume("ZZ1806",true,consumer);
       /* //7、销毁
        channel.close();
        connection.close();*/

    }
}
