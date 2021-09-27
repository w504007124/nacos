package com.wh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
@RefreshScope
public class nacosConfigController {


    @Value("${nacos.config}")
    private String name;

    @RequestMapping("/getConfig")
    public String getConfig(){
        return name;
    }
}
