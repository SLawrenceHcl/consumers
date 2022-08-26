package com.example.consumers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;
import java.util.function.Consumer;

@Configuration
public class consumersConfig {

    @Bean
    public Consumer<String> consumer1(){
        return String ->{
            System.out.println("consumer1: " + String);
        };
    }

//    @Bean
//    public Consumer<String> consumer2(){
//        return String -> {
//            System.out.println("consumer2: " + String);
//        };
////        return text -> System.out.println(text);
//
//    }
}
