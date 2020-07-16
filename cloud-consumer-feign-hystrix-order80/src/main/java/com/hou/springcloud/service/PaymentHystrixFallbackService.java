package com.hou.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentHystrixFallbackService
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 15:53
 * @Version 1.0
 */
@Component
public class PaymentHystrixFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PaymentFallback fallback  paymentInfo_timeout /(ㄒoㄒ)/~~";

    }

    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentFallback fallback  paymentInfo_ok /(ㄒoㄒ)/~~";
    }
}
