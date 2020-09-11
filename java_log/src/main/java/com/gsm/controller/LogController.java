package com.gsm.controller;

import com.gsm.entity.User;
import com.gsm.service.LogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("log")
@Slf4j
public class LogController {
    @Autowired
    private LogService logService;

    //public static Logger log = LoggerFactory.getLogger(LogApplication.class);

    @PostMapping("demo")
    public String insertSth(@RequestBody User user) {
        log.info("user.name = " + user.getName());
        String s = logService.insertSth(user);
        return s;
    }

    @DeleteMapping("demo/{name}")
    public String deleteSth(@PathVariable("name") String name) {
        logService.deleteSth(name);
        log.info("删除成功");
        return "success";
    }

}