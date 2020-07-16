package com.hou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ZookeeperZk80
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/13 21:27
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperZk80 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperZk80.class,args);
    }
}
