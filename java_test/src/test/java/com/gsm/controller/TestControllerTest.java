package com.gsm.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
    @Autowired
    private TestController testController;

    @Test
    public void t() {
        String s = testController.getSth("s");
        System.out.println(s);
    }

    @Test
    public void t1() {
        boolean flag = 0.1 + 0.2 == 0.3;
        System.out.println(flag);
    }
}