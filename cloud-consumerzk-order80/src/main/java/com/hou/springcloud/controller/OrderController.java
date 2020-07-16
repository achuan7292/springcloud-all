package com.hou.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/13 21:33
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL="http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentZk(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }
}
