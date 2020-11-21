package com.gsm.service;

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
    public void getSth(String s) {
        rabbitTemplate.convertAndSend("fff","",s);
    }

    @Override
    public void insertSth(User user) {
        User u = User.builder()
                .name(user.getName())
                .age((int)(Math.random()*(100-1+1)+1))
                .build();
        rabbitTemplate.convertAndSend("fff","",u);
    }
}
