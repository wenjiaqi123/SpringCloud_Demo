package com.gsm.controller;

import com.gsm.entity.User;
import com.gsm.exception.entity.R;
import com.gsm.service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validate")
public class ValidateController {
    @Autowired
    private ValidateService validateService;

    @PostMapping("demo")
    public R insertSth(@Validated(value = User.insert.class) @RequestBody User user) {
        return new R();
    }
}
