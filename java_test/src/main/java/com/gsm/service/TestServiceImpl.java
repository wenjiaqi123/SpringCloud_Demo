package com.gsm.service;

import com.gsm.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getSth(String s) {
        System.out.println("TestServiceImpl.getSth");
        return "我是service的返回值";
    }
}
