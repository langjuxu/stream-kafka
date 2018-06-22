package com.qian.streamkafka.controller;

import com.qian.streamkafka.service.IntegrationProducer;
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

    @Autowired
    IntegrationProducer producer;

    @GetMapping(value = "/sendProvider", produces = "application/json;charset=UTF-8")
    public boolean sendProvider(String msg) {
        System.err.println("++++++++++开始发送信息++++++++++++++++");
        return producer.sendMessage(msg);
    }
}
