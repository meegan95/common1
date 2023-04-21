package com.example.eurekaclient2.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/new")
public class RestController {

    @GetMapping("/name")
    public String name(){
        return "Hey!";
    }
}
