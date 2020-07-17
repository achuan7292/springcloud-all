package com.hou.cloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FlowLimitController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/17 11:00
 * @Version 1.0
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() throws InterruptedException {
        Thread.sleep(1000);
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName()+"\t"+"testB");
        return "----testB";
    }


    @GetMapping("/testD")
    public String testD() throws InterruptedException {
        Thread.sleep(1000);
        return "----testD  RT";
    }


    @GetMapping("/testE")
    public String testE() throws InterruptedException {
        int age = 1 /0 ;
        return "----testE 异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_HotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false)String p1,
                             @RequestParam(value = "p2",required = false)String p2){
        return "----------testHotKey";
    }

    public String deal_HotKey(String p1, String p2, BlockException exception){
        return "热点限流规则，兜底方法";
    }
}
