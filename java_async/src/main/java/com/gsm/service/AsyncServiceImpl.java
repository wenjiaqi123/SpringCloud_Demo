package com.gsm.service;

import com.gsm.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AsyncServiceImpl implements AsyncService {
    @Autowired
    private FileUtils fileUtils;

    @Override
    public void getSth(Integer t) {
        for (int i = 0; i < t; i++) {
            fileUtils.storeFile();
        }
    }

    @Override
    public void getSthReturn(Integer t) {
        for (int i = 0; i < t; i++) {
            Future<Integer> future = fileUtils.storeFiles();
            while (true){
                if(future.isDone()){
                    Integer r = null;
                    try {
                        r = future.get();
                        System.out.println(r);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}