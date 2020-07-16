package com.hou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigAppMain3344
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/15 12:32
 * @Version 1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigAppMain3344 {

    public static void main(String[] args) {

        SpringApplication.run(ConfigAppMain3344.class,args);
    }
}
