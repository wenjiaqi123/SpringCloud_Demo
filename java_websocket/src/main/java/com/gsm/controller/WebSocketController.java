package com.gsm.controller;

import com.gsm.server.WebSocketServer;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("websocket")
public class WebSocketController {

    @GetMapping("/{cid}")
    public String socket(@PathVariable("cid") String cid){
        System.out.println("cid " + cid);
        pushToWeb(cid,"我是客户端的信息");
        return "success";
    }

    @ResponseBody
    @RequestMapping("/socket/push/{cid}")
    public Object pushToWeb(@PathVariable("cid") String cid,String msg){
        System.out.println("--pushToWeb接口--");
        //WebSocketServer.sendInfoAll(msg,cid);
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebSocketServer.sendInfoAll(new Date().toString(),cid);
        }
        return "aa";
    }
}
