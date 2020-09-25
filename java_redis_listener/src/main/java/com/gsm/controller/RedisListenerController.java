package com.gsm.controller;

import com.gsm.service.RedisListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("l")
public class RedisListenerController {
    @Autowired
    private RedisListenerService redisListenerService;

    @GetMapping("demo")
    public String sendGirl(String s) {
        redisListenerService.insertSth(s);
        return "success";
    }

    @GetMapping("t")
    public String getTimeExpire(Integer seconds) {
        redisListenerService.getTimeExpire(seconds);
        return "success";
    }
}
