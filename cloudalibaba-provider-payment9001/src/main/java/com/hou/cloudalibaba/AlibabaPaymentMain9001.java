package com.hou.cloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AlibabaPaymentMain9001
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/16 16:44
 * @Version 1.0
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class AlibabaPaymentMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentMain9001.class,args);

    }
}
