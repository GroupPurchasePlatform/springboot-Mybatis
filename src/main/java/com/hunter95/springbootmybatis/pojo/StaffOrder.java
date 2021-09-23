package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffOrder {

    private int order_id;
    private int product_id;
    private String staff_id;
    private String staff_nickname;
    private String staff_phoneNumber;
    private String staff_address;
    private String order_date;
    private double order_totalMoney;
    private String order_status;
    private String order_payment;
    private String order_comment;

}
