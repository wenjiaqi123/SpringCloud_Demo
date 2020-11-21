package com.gsm.service.impl;

import com.gsm.entity.User;
import com.gsm.service.RabbitMQService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements RabbitMQService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendMsg(String msg) {
        /**
         * 发送消息
         */
        rabbitTemplate.convertAndSend("fff", "", msg);
        User user = new User(msg, (int) (Math.random() * (10 - 1 + 1)) + 1);
        int i = 1/0;
        rabbitTemplate.convertAndSend("fff", "", user);
    }

    @Override
    public void sendUser(User user) {
        user.setAge((int) (Math.random() * (10 - 1 + 1)) + 1);
        rabbitTemplate.convertAndSend("fff", "test", user);
    }
}
