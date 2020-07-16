package com.hou.springcloud.controller;

import com.hou.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName SendMessageController
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/16 11:43
 * @Version 1.0
 */
@RestController
public class SendMessageController {

    @Resource
    IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();

    }
}
