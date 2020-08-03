package com.springboottesting.springboottesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@SpringBootConfiguration
public class SpringbootTestingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestingApplication.class, args);



    }

}
