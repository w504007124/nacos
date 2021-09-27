package com.wh.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 建议一个消息的消费者
 * @RabbitListener表示对队列hello进行监听，
 * @RabbitHandler指定对消息的处理方法；
 */
@Component
@RabbitListener(queues = "hello")
public class MqConsumerController {

    @RabbitHandler
    public void process(String hello){
        System.out.println("receiver:" + hello);
    }
}
