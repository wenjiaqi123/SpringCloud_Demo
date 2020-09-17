package com.gsm.controller;

import com.gsm.entity.SysUser;
import com.gsm.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("r")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    /**
     * 校验 手机号是否注册
     * @param iphoneNo
     * @return
     */
    @GetMapping("iphoneNo")
    public boolean selectIphoneNo(String iphoneNo) {
        boolean flag = registerService.selectIphoneNo(iphoneNo);
        return flag;
    }

    @PostMapping("demo")
    public boolean insertUser(@RequestBody SysUser user) {
        boolean flag = registerService.insertUser(user);
        return flag;
    }
}