package com.gsm.service;

import com.gsm.entity.User;

public interface RabbitMQService {
    void getSth(String s);

    void insertSth(User user);
}
