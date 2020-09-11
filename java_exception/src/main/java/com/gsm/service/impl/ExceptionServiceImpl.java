package com.gsm.service.impl;

import com.gsm.service.ExceptionService;
import org.springframework.stereotype.Service;

@Service
public class ExceptionServiceImpl implements ExceptionService {

    @Override
    public Integer getSth(String s) {
        System.out.println("ExceptionServiceImpl.getSth");
        return (int) ((Math.random() * (100 - 1 + 1) + 1));
    }
}
