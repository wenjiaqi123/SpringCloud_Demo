package com.gsm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController = @Controller + @ResponseBody
 * @Controller
 * @ResponseBody
 *
 * @RequestMapping("demo")
 *
 * @GetMapping("first")
 */
@RestController
@RequestMapping("demo")
public class FirstController {

    @GetMapping("first")
    public String firstDemo(String s){
        System.out.println(s);
        return "success-成功";
    }
}