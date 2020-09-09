package com.gsm.controller;

import com.gsm.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("demo")
    public String getSth(String s) {
        String ss = testService.getSth(s);
        System.out.println("TestController.getSth");
        return ss;
    }
}
