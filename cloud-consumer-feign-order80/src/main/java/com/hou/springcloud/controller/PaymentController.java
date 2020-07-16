package com.hou.springcloud.controller;

import com.hou.springcloud.entities.CommonResult;
import com.hou.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 10:55
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        return paymentService.getPayment(id);
    }

    @GetMapping(value = "/consumer/payment/timeout")
    public String timeout(){
        return paymentService.timeout();
    }
}
