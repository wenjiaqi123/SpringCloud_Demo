package com.gsm.service;

import com.gsm.entity.User;

public interface RabbitMQService {
    void sendMsg(String msg);

    void sendUser(User user);
}
