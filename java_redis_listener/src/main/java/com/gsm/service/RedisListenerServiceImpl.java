package com.gsm.service;

import com.gsm.service.RedisListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisListenerServiceImpl implements RedisListenerService {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public void insertSth(String s) {
        redisTemplate.convertAndSend("girl",s);
    }

    @Override
    public void getTimeExpire(Integer seconds) {
        redisTemplate.opsForValue().set("name","我是值",seconds, TimeUnit.SECONDS);
    }
}
