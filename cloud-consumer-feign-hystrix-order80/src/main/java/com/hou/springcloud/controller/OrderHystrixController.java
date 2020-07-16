package com.hou.springcloud.controller;

import com.hou.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderHystrixController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 14:22
 * @Version 1.0
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentInfo_Global_Fallback")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
//    @HystrixCommand
    public  String paymentInfo_ok(@PathVariable("id")Integer id){
        return paymentHystrixService.paymentInfo_ok(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    //代码耦合
//    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    public  String paymentInfo_timeout(@PathVariable("id")Integer id){
        return paymentHystrixService.paymentInfo_timeout(id);
    }

    public String paymentInfo_timeoutHandler(Integer id){
        return "消费者80，对方系统繁忙或自己出错";
    }

    //全局方法不能有参数。。。会报方法找不到异常
    public String paymentInfo_Global_Fallback(){
        return "消费者80，全局方法，对方系统繁忙或自己出错";
    }
}
