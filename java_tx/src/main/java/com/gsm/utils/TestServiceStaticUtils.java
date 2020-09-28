package com.gsm.utils;

import com.gsm.entity.Money;
import com.gsm.service.TxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 在 utils 静态方法中引入 service
 * 1:   静态变量
 * 2:   引入 service 自动装配
 * 3:   静态同步设置 service,将自动装配的 service 赋值给 静态service
 * 4:   @PostConstruct 初始化
 */
@Component
public class TestServiceStaticUtils {
    private static TxService service;
    @Autowired
    private TxService txService;

    @PostConstruct
    public void init() {
        if (service == null) {
            setService(txService);
        }
    }

    private synchronized static void setService(TxService txService) {
        service = txService;
    }

    public static void test() {
        List<Money> all = service.getAll();
        System.out.println("我被加载了" + all.size());
    }
}
