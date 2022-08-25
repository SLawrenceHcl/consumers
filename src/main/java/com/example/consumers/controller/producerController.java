package com.example.consumers.controller;


import com.example.consumers.service.producerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class producerController {
//    @Autowired
//    producerService producerService;
    @Autowired
    StreamBridge streamBridge;

    @PostMapping("/producer")
    public String producer(@RequestBody String text){
        streamBridge.send("producer-in", text);
        //producerService.send(text);
        return text;
    }

}
