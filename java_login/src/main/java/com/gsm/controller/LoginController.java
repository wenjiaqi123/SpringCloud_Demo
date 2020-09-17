package com.gsm.controller;

import com.gsm.entity.SysUser;
import com.gsm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("demo")
    public boolean getSth(SysUser sysUser) {
        boolean flag = loginService.getSth(sysUser);
        return flag;
    }
}
