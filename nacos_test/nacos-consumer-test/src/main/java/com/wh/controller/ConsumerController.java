package com.wh.controller;


import com.wh.feign.ProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nacos")
public class ConsumerController {

    @Autowired
    private ProviderFeignService feignService;

    @RequestMapping("/getConsumer")
    public String getConsumer(){
        return feignService.getProvider("嘎嘎嘎");
    }
}
