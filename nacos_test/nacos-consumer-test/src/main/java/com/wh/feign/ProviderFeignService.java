package com.wh.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-provider")
public interface ProviderFeignService {

    @RequestMapping("/nacos/getProvider")
    public String getProvider(@RequestParam("str") String str);

}
