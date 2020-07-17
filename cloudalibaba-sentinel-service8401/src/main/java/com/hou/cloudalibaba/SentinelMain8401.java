package com.hou.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SentinelMain8401
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/17 10:57
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelMain8401 {

    public static void main(String[] args) {
        SpringApplication.run(SentinelMain8401.class,args);
    }
}
