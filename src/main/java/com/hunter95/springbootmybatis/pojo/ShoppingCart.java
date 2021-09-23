package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    private int consumer_id;
    private int product_id;
    private String product_name;
    private double product_price;
    private int product_num;
    private String product_surfacePlot;

}
