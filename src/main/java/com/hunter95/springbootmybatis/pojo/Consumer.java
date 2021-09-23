package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {

    private String consumer_id;
    private String consumer_name;
    private String consumer_password;
    private String consumer_nickname;
    private String consumer_head;
    private String consumer_phoneNumber;
    private String consumer_address;

}
