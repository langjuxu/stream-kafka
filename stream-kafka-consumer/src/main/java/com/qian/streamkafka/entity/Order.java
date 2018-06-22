package com.qian.streamkafka.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qian
 * @date 2018/6/22
 */
@Data
public class Order {

    String orderNum;
    BigDecimal orderMoney;
    int orderCount;
    String msg;
}
