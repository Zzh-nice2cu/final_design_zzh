package com.pwms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//用mapperscan扫描dao层
@MapperScan("com.pwms.dao")
@SpringBootApplication
public class PwmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PwmsApplication.class, args);
    }
}
