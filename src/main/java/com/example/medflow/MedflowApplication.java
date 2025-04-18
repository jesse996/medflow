package com.example.medflow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.medflow.repository.mapper")
public class MedflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedflowApplication.class, args);
    }

}
