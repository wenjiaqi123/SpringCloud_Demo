package com.gsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan("com.gsm.dao") 扫描持久层接口
 * 如果启动类上不加 @MapperScan() 那么 dao 层下面每个接口都要加 @Repository
 */
@MapperScan("com.gsm.dao")
@SpringBootApplication
public class SSMApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSMApplication.class);
    }
}