package com.sanshao.basic.springbootm2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class Springbootm2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootm2Application.class, args);
    }

}
