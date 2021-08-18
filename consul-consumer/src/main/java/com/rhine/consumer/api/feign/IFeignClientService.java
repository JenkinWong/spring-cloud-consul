package com.rhine.consumer.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "consul-provider")
public interface IFeignClientService {

    @GetMapping("/hello")
    String hello();
}
