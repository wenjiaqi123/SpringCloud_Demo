package com.gsm.service;

public interface RedisListenerService {
    void insertSth(String s);

    void getTimeExpire(Integer seconds);
}
