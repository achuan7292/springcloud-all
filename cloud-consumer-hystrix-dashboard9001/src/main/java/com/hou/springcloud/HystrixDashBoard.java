package com.hou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName HystrixDashBoard
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 17:21
 * @Version 1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard.class,args);
    }
}
