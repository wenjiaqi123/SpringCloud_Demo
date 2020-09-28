package com.gsm.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JobUtils {
    private static String cron;

    @Value("${job.time}")
    public void setCron(String cron){
        JobUtils.cron = cron;
    }

    public static void exec(){
        System.out.println(cron);
    }
}
