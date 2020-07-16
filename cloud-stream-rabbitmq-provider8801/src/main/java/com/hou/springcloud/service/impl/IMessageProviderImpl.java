package com.hou.springcloud.service.impl;

import com.hou.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName IMessageProviderImpl
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/16 11:38
 * @Version 1.0
 */
//定义消息的推送管道
@EnableBinding(Source.class)
public class IMessageProviderImpl implements IMessageProvider {
    //消息发送管道
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("**************"+serial);
        return serial;
    }
}
