package com.gsm.controller;

import com.gsm.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class RedisController {
    @Autowired
    private RedisService redisService;

    /**
     * 只要保证    @GetMapping("demo/{aid}")    里面 括号里的内容id 和 @PathVariable("aid") 的内容一致
     * @PathVariable("aid") 的意思可以理解为  将url路径中的 aid 的位置的内容,赋值给 String id
     * @param id
     * @return
     */
    @GetMapping("demo/{aid}")
    public String getUser(@PathVariable("aid") String id) {
        String str = redisService.getUser(id);
        return str;
    }
}
