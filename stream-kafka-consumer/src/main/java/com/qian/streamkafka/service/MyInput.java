package com.qian.streamkafka.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @author qian
 * @date 2018/6/22
 * 自定义的input通道
 */
public interface MyInput {

    String MY_INPUT = "my_input";

    @Input(value = MyInput.MY_INPUT)
    MessageChannel my_input();

}
