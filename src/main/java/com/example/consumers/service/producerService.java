package com.example.consumers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class producerService {

    @Autowired
    StreamBridge streamBridge;

    public void send(String text){
        streamBridge.send("producer-in-0", text);
    }
}
