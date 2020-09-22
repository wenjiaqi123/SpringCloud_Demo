package com.gsm.utils;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Component
public class FileUtils {

    @Async
    public void storeFile(){
        try {
            System.out.println("开始" + Thread.currentThread().getName() + "\t" + new Date());
            TimeUnit.SECONDS.sleep(3);
            System.out.println("结束" + Thread.currentThread().getName() + "\t" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Async
    public Future<Integer> storeFiles(){
        int t = (int)(Math.random()*(5-2+1)+2);
        try {
            System.out.println("开始" + Thread.currentThread().getName() + "\t" + new Date());
            TimeUnit.SECONDS.sleep(t);
            System.out.println("结束" + Thread.currentThread().getName() + "\t" + new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Future<Integer> result = new AsyncResult<>(t);
        return result;
    }
}