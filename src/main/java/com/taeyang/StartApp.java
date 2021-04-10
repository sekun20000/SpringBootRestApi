package com.taeyang;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class StartApp {
    public static void main(String[] args) {
        try {
            SpringApplication.run(StartApp.class,args);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
