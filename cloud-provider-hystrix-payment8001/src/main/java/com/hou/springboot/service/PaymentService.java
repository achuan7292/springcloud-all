package com.hou.springboot.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentServic
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 12:52
 * @Version 1.0
 */
@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id){
        return "线程池"+Thread.currentThread().getName()+"  "+"paymentInfo_ok,id: "+id+"\t"+"O(∩_∩)O~";
    }

    //服务降级
    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String paymentInfo_timeout(Integer id){
        int timeNumber = 5;
        //int age = 10/0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池"+Thread.currentThread().getName()+"  "+"paymentInfo_timeout,id: "+id+"\t"+"O(∩_∩)O~"+"耗时"+timeNumber;

    }

    public String paymentInfo_timeoutHandler(Integer id){
        return "线程池"+Thread.currentThread().getName()+"  "+"paymentInfo_timeout,id: "+id+"\t"+"/(ㄒoㄒ)/~~";
    }

    //===服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),         //是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),                                   //请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),                                 //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")                  //失败率达到多少跳闸断路
        })
    public String paymentCircuitBreaker(@PathVariable("id")Integer id){
        if (id<0){
            throw new RuntimeException("-**************id 不可以为负数");
        }

        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t" +"调用成功"+serialNumber;

    }

    public String paymentCircuitBreaker_fallback(@PathVariable Integer id){
        return "-**************id 不可以为负数 /(ㄒoㄒ)/~~"+id;
    }
}
