package com.gsm.controller;

import com.gsm.entity.User;
import com.gsm.service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("r")
public class RabbitMQController {
    @Autowired
    private RabbitMQService mqService;

    @PostMapping("msg")
    public String sendMsg(String msg) {
        mqService.sendMsg(msg);
        return "success";
    }

    @PostMapping("user")
    public String sendUser(@RequestBody User user) {
        mqService.sendUser(user);
        return "success";
    }
}
