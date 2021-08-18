package com.rhine.consumer.api.controller;

import com.rhine.consumer.api.feign.IFeignClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final IFeignClientService feignClientService;

    public HelloController(IFeignClientService feignClientService) {
        this.feignClientService = feignClientService;
    }

    @GetMapping
    public String hello() {
        return feignClientService.hello();
    }
}
