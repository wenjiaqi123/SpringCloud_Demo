package com.gsm.controller;

import com.gsm.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("async")
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("demo")
    public String getSth(Integer t) {
        asyncService.getSth(t);
        return "success";
    }

    @GetMapping("r")
    public String getSthReturn(Integer t) {
        asyncService.getSthReturn(t);
        return "success";
    }
}
