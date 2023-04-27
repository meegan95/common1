package com.example.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/main")
public class RestController {

    @Value("${eureka.instance.instanceId}")
    private String port;
    @GetMapping("/test")
    public String test(){
        return "test : " + port;
    }
}
