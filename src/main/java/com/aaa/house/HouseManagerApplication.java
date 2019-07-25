package com.aaa.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.aaa.house.dao")
public class HouseManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseManagerApplication.class, args);
    }

}
