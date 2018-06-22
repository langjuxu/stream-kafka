package com.qian.streamkafka.service;

import com.qian.streamkafka.entity.Order;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author qian
 * @date 2018/6/22
 */
@EnableBinding(Sink.class)
public class IntegrationConsumer {

    @StreamListener(Sink.INPUT)
    public void consumer(Order order){
        System.err.println("<<<<<<<<<<消费者消费了>>>>>>>>>>>>>>>>");
        System.err.println(order);
    }
}
