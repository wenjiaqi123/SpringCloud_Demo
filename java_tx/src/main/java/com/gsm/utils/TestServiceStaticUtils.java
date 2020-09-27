package com.gsm.utils;

import com.gsm.entity.Money;
import com.gsm.service.TxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class TestServiceStaticUtils {
    private static TxService service;
    @Autowired
    private TxService txService;

    @PostConstruct
    public void init(){
        if(service==null){
            setService(txService);
        }
    }

    private synchronized static void setService(TxService txService){
        service = txService;
    }

    public static void test(){
        List<Money> all = service.getAll();
        System.out.println(all.size());
    }
}
