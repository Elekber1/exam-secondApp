package com.example.natifire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NatifireApplication {

    public static void main(String[] args) {
        SpringApplication.run(NatifireApplication.class, args);
    }

}
