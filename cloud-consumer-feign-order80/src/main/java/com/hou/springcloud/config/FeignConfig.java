package com.hou.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName FeignConfig
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 11:31
 * @Version 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level FeignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
