package com.gsm.consumer;

import com.gsm.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @RabbitListener(queues = "qqq") 监听名为 qqq 的队列
 */
@Component
@RabbitListener(queues = "qqq")
public class RabbitMQConsumer {

    @RabbitHandler
    public void consumerMsg(String s){
        System.out.println("qqq 队列的String\t" + s);
    }

    @RabbitHandler
    public void consumerUser(User user){
        System.out.println("qqq 队列的 姓名" + user.getName() + "\t年龄" + user.getAge());
    }
}