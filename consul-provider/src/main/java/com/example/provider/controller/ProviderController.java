package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping
    private String hello(){
        return "hello world by " + serverPort;
    }

}
