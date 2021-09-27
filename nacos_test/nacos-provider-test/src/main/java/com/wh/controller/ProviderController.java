package com.wh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacos")
public class ProviderController {


    @RequestMapping("/getProvider")
    public String getProvider(String str){
        return "这是provider"+str;
    }

}
