package com.qian.streamkafka.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author qian
 * @date 2018/6/22
 * 自定义output通道通道
 */
public interface MyOutput {

    String MY_OUTPUT = "my_output";

    @Output(MyOutput.MY_OUTPUT)
    MessageChannel my_output();

}
