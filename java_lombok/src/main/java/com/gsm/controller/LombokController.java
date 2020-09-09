package com.gsm.controller;

import com.gsm.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lombok")
public class LombokController {

    @PostMapping("demo")
    public User insertSth(@RequestBody User user) {
        System.out.println("user.name = " + user.getName());
        System.out.println("user.age = " + user.getAge());
        User u = User.builder()
                .name(user.getName())
                .age((int)(Math.random()*(100-1+1)+1))
                .build();
        return u;
    }

    @DeleteMapping("demo/{id}")
    public String deleteSth(@PathVariable("id") String id) {
        System.out.println("id = " + id);
        return "success";
    }

    @PutMapping("demo")
    public User updateSth(@RequestBody User user) {
        System.out.println("user.name = " + user.getName());
        System.out.println("user.age = " + user.getAge());
        User u = User.builder()
                .name(user.getName())
                .age(user.getAge() + (int) (Math.random() * (50 - 1 + 1) + 1))
                .build();
        return u;
    }

    @GetMapping("demo")
    public String getSth(String s) {
        System.out.println("s = " + s);
        return "success";
    }
}
