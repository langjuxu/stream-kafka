package com.qian.streamkafka.service;

import com.qian.streamkafka.entity.Order;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author qian
 * @date 2018/6/22
 * 原生Spring Integration支持的生产者
 */
@EnableBinding(Source.class)
public class IntegrationProducer {

    @Resource
    private Source source;

    public boolean sendMessage(String msg) {
        System.err.println("<<<<<<<<<<<<<<<<生产者生产了>>>>>>>>>>>>>>>>>>");
        Order order = new Order();
        order.setOrderNum("00001");
        order.setOrderMoney(BigDecimal.valueOf(99.9));
        order.setOrderCount(10);
        order.setMsg(msg);

        boolean send = source.output().send(MessageBuilder.withPayload(order).build());
        return send;
    }
}
