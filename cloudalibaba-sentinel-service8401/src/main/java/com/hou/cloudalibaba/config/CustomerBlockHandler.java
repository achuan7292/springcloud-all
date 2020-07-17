package com.hou.cloudalibaba.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hou.springcloud.entities.CommonResult;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/17 14:55
 * @Version 1.0
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return new CommonResult(200,"自定义的限流信息----------CustomerBlockHandler-1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(200,"自定义的限流信息----------CustomerBlockHandler-2");
    }
}
