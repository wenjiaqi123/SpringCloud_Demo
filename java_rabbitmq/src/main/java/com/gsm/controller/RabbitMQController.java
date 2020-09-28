package com.gsm.controller;

import com.gsm.entity.User;
import com.gsm.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("r")
public class RabbitMQController {
    @Autowired
    private RabbitMQService mqService;

    /**
     * 向队列发送 String 简单类型
     * @param s
     * @return
     */
    @GetMapping("demo")
    public String getSth(String s) {
        mqService.getSth(s);
        return "success";
    }

    /**
     * 向队列发送复杂类型
     * @param user
     * @return
     */
    @PostMapping("demo")
    public String insertSth(@RequestBody User user) {
        mqService.insertSth(user);
        return "success";
    }
}