package com.hou.cloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/16 18:17
 * @Version 1.0
 */
@RestController
@RefreshScope //支持nacos的动态刷新
public class ConfigController {


    @Value("${config.info}")
    private String configInfo;

    @GetMapping("getConfig")
    public String getConfigInfo(){
        return configInfo;
    }
}
