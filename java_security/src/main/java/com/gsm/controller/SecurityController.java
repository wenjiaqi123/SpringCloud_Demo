package com.gsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("security")
public class SecurityController {

    @GetMapping("demo")
    public String getSth(String s) {
        System.out.println("s = " + s);
        return "success";
    }
}