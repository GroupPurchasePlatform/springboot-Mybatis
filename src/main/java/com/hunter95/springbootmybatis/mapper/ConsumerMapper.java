package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Consumer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ConsumerMapper {

    List<Consumer> query();

    Consumer queryByConsumerId(int id);

    int insert(Consumer consumer);

    //修改姓名
    int update_consumer_name(String id,String name);

    //修改密码
    int update_consumer_password(String id,String psw);

    //修改昵称
    int update_consumer_nickname(String id,String nickname);

    //修改用户头像
    int update_consumer_head(String id,String head);

    //修改电话
    int update_consumer_phoneNumber(String id,String phoneNumber);

    //修改地址
    int update_consumer_address(String id,String address);

    int delete(String id);
}
