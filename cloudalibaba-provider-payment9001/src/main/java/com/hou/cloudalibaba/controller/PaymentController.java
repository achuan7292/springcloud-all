package com.hou.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/16 16:46
 * @Version 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string+"\t"+port;
    }
}
