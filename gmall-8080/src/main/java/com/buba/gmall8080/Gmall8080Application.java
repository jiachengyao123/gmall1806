package com.buba.gmall8080;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.buba.gmall8080.mapper")
public class Gmall8080Application {

    public static void main(String[] args) {
        SpringApplication.run(Gmall8080Application.class, args);
    }

}
