package com.hunter95.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministratorLoginMessage extends LoginMessage{
    private Administrator AdministratorLoginMessage;
    public AdministratorLoginMessage(String state,String token,Administrator administrator){
        super(state,token);
        AdministratorLoginMessage=administrator;
    }
}
