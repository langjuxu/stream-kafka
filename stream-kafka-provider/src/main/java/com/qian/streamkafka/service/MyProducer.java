package com.qian.streamkafka.service;

import com.qian.streamkafka.entity.Order;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author qian
 * @date 2018/6/22
 * 自定义的生产者
 */
@EnableBinding(MyOutput.class)
@Component
public class MyProducer {

    @Resource
    private MyOutput myOutput;

    public boolean sendMessage(String msg) {
        System.err.println("<<<<<<<<<<<<<<<<自定义的生产者生产了>>>>>>>>>>>>>>>>>>" + msg);
        Order order = new Order();
        order.setOrderNum("00002");
        order.setOrderMoney(BigDecimal.valueOf(999.9));
        order.setOrderCount(10);
        order.setMsg(msg);

        boolean send = myOutput.my_output().send(MessageBuilder.withPayload(order).build());
        return send;
    }

}
