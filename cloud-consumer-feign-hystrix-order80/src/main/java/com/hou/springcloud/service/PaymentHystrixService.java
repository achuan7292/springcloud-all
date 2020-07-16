package com.hou.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
//前者为服务提供方，后为配置服务降级
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentHystrixFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/timeout/{id}")

    public  String paymentInfo_timeout(@PathVariable("id")Integer id);

    @GetMapping("/payment/hystrix/ok/{id}")
    public  String paymentInfo_ok(@PathVariable("id")Integer id);
}


