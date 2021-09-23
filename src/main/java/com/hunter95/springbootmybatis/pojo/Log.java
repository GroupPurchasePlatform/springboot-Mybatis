package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {

    private int log_id;
    private String administrator_id;
    private String log_type;
    private String log_content;
    private String log_date;

}
