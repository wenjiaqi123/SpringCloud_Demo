package com.gsm.controller;

import com.gsm.exception.entity.R;
import com.gsm.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("exce")
public class ExceptionController {
    @Autowired
    private ExceptionService exceptionService;

    @GetMapping("demo")
    public R getSth(String s) {
        Integer i = exceptionService.getSth(s);
        System.out.println("ExceptionController.getSth");
        List<String> lists = new ArrayList();
        lists.add("dd");
        lists.add("dd");
        return R.builder()
                .flag(true)
                .code(20001)
                .msg("sss")
                .data(lists)
                .build();
    }
}
