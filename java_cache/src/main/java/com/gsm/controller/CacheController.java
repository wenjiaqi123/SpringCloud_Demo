package com.gsm.controller;

import com.gsm.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cache")
public class CacheController {
    @Autowired
    private CacheService cacheService;

    @GetMapping("demo")
    public String getUserById(String id) {
        String str = cacheService.getUserById(id);
        return str;
    }

}
