package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int product_id;
    private int shop_id;
    private String product_name;
    private double product_price;
    private String product_status;
    private int product_inventory;
    private String product_type;
    private String product_specification;
    private String product_descript;
    private String product_surfacePlot;
    private String product_slideshow;
    private int product_isComment;
    private String product_QRcode;

}
