package com.example.consumers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Locale;
import java.util.function.Consumer;

@Configuration
public class consumersConfig {

    @Bean
    public Consumer<String> consumer1(){
        return String -> String.toUpperCase(Locale.ROOT);
    }

    @Bean
    public Consumer<String> consumer2(){
        return String -> String.toLowerCase(Locale.ROOT);
    }
}
