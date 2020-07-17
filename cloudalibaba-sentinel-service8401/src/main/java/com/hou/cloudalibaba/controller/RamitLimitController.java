package com.hou.cloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.hou.cloudalibaba.config.CustomerBlockHandler;
import com.hou.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RamitLimitController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/17 14:53
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/rateLimit")
public class RamitLimitController {

    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",blockHandlerClass = CustomerBlockHandler.class,blockHandler = "handleException")
    public CommonResult customerHandler(){
        return new CommonResult(200,"按照客户自定义处理逻辑");
    }
}
