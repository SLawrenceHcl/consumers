package com.example.consumers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class producerConfig {
    @Bean
    public Function<String, String> producer(){
        return text -> text;
    }
}