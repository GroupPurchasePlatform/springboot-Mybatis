package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffLoginMessage extends LoginMessage{
    public String State;
    public String Token;
    private Staff StaffMessage;
}
