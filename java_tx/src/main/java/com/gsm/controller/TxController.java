package com.gsm.controller;

import com.gsm.entity.Money;
import com.gsm.service.TxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tx")
public class TxController {
    @Autowired
    private TxService txService;

    @GetMapping("demo/{from}/{to}/{money}")
    public String updateSth(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("money") String money) {
        String s = txService.updateSth(from,to,money);
        return s;
    }

    @GetMapping("demo")
    public List<Money> getSth() {
        List<Money> list = txService.getAll();
        return list;
    }
}
