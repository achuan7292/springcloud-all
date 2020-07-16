package com.hou.springboot.controller;

import com.hou.springboot.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName paymentController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 12:57
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public  String paymentInfo_ok(@PathVariable("id")Integer id){
        String result = paymentService.paymentInfo_ok(id);
        log.info("**********:{}",result);

        return  result;

    }


    @GetMapping("/payment/hystrix/timeout/{id}")
    public  String paymentInfo_timeout(@PathVariable("id")Integer id){
        String result = paymentService.paymentInfo_timeout(id);
        log.info("**********:{}",result);

        return  result;

    }

    @GetMapping("/payment/hystrix/circuit/{id}")
    public  String paymentCircuitBreaker(@PathVariable("id")Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("**********:{}",result);

        return  result;

    }
}
