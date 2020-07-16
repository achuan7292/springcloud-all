package com.hou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderFeignMain80
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/14 10:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients()
public class OrderFeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
