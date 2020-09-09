package com.gsm.controller;

import com.gsm.entity.Money;
import com.gsm.service.SSMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ssm")
public class SSMController {
    @Autowired
    private SSMService ssmService;

    @GetMapping("demo/{from}/{to}/{money}")
    public String updateSth(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("money") String money) {
        String s = ssmService.updateSth(from,to,money);
        return s;
    }

    @GetMapping("demo")
    public List<Money> getSth() {
        List<Money> list = ssmService.getAll();
        return list;
    }
}
