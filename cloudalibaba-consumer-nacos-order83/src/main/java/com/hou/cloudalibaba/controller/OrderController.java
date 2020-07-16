package com.hou.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/16 17:36
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String serverUrl;

    @GetMapping("/consumer/payment/{string}")
    public String orderPayment(@PathVariable String string){
        return restTemplate.getForObject(serverUrl+"/payment/"+string,String.class);
    }
}
