package com.example.eurekaclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/main")
public class RestController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
