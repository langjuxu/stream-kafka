package com.qian.streamkafka.service;

import com.qian.streamkafka.entity.Order;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import javax.annotation.Resource;

/**
 * @author qian
 * @date 2018/6/22
 */
@EnableBinding(MyInput.class)
public class MyConsumer {

    @Resource
    private MyInput myInput;

    @StreamListener(value = MyInput.MY_INPUT)
    public void consumer(Order order){
        System.err.println("<<<<<<<<<<自定义消费者消费了>>>>>>>>>>>>>>>>");
        System.err.println(order);
        // 通过监听获取的信息，进行处理
    }


}
