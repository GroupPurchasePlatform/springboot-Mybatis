package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    private String staff_id;
    private String enterprise_name;
    private String staff_name;
    private String staff_password;
    private String staff_nickname;
    private String staff_head;
    private String staff_phoneNumber;
    private String staff_address;
    private double staff_card;

}
