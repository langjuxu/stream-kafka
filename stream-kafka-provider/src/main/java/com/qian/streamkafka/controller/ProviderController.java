package com.qian.streamkafka.controller;

import com.qian.streamkafka.service.IntegrationProducer;
import com.qian.streamkafka.service.MyProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qian
 * @date 2018/6/22
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    // 默认的output通道
    @Autowired
    private IntegrationProducer producer;

    // 自定义的output通道
    @Autowired
    private MyProducer myProducer;

    @GetMapping(value = "/sendProvider", produces = "application/json;charset=UTF-8")
    public boolean sendProvider(String msg) {
        System.err.println("++++++++++sendProvider开始发送信息++++++++++++++++");
        return producer.sendMessage(msg);
    }

    @GetMapping(value = "/sendMyProvider", produces = "application/json;charset=UTF-8")
    public boolean sendMyProvider(String msg) {
        System.err.println("++++++++++sendMyProvider开始发送信息++++++++++++++++");
        return myProducer.sendMessage(msg);
    }
}
