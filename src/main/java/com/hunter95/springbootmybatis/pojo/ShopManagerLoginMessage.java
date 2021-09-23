package com.hunter95.springbootmybatis.pojo;


public class ShopManagerLoginMessage extends LoginMessage{
    private ShopManager ShopManagerMessage;
    public ShopManagerLoginMessage(String state,String token,ShopManager shopManager){
        super(state,token);
        ShopManagerMessage=shopManager;
    }
}
