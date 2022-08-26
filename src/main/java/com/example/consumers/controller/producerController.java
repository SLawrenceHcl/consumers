package com.example.consumers.controller;


import com.example.consumers.service.producerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class producerController {
    @Autowired
    producerService producerService;
    @Autowired
    StreamBridge streamBridge;

    @PostMapping("/producer/{text}")
    public String producer(@PathVariable String text){

        producerService.send(text);
        return text;
    }

}
