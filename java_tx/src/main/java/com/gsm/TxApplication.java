package com.gsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.gsm.dao")
@SpringBootApplication
public class TxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxApplication.class);
    }
}
