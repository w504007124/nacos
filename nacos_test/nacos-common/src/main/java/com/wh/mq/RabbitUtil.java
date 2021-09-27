package com.wh.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 建立一个消息的生产者
 */
@Component
public class RabbitUtil {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String content = "hello" + new Date();
        System.out.println("Sender:" +content);
        this.amqpTemplate.convertAndSend("hello",content);
    }

}
