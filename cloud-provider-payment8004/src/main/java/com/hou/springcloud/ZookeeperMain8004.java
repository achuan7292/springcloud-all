package com.hou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ZookeeperMain8004
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/13 20:54
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperMain8004.class,args);
    }
}
