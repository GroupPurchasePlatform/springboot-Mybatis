package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerOrder {

    private int order_id;
    private int product_id;
    private String consumer_id;
    private String consumer_nickname;
    private String consumer_phoneNumber;
    private String consumer_address;
    private String order_date;
    private double order_totalMoney;
    private String order_status;
    private String order_payment;
    private String order_comment;

}
