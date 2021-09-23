package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Announcement {

    private int announcement_id;
    private int shop_id;
    private String announcement_title;
    private String announcement_details;

}
