package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.ConsumerOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ConsumerOrderMapper {

    List<ConsumerOrder> query();

    ConsumerOrder queryByOrderId(int id);

    List<ConsumerOrder> queryByProductId(int id);

    List<ConsumerOrder> queryByConsumerId(String id);

    int insert(ConsumerOrder consumerOrder);

    //修改昵称
    int update_consumer_nickname(int id, String nickname);

    //修改电话
    int update_consumer_phoneNumber(int id, String phoneNumber);

    //修改地址
    int update_consumer_address(int id, String address);

    //修改状态
    int update_order_status(int id, String status);

    //修改备注
    int update_order_comment(int id, String comment);

    int delete(int id);
}
