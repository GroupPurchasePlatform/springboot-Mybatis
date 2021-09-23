package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Staff;
import com.hunter95.springbootmybatis.pojo.StaffOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffOrderMapper {

    List<StaffOrder> query();

    StaffOrder queryByOrderId(int id);

    List<StaffOrder> queryByProductId(int id);

    List<StaffOrder> queryByStaffId(String id);

    int insert(StaffOrder staffOrder);

    //修改昵称
    int update_staff_nickname(int id, String nickname);

    //修改电话
    int update_staff_phoneNumber(int id, String phoneNumber);

    //修改地址
    int update_staff_address(int id, String address);

    //修改状态
    int update_order_status(int id, String status);

    //修改备注
    int update_order_comment(int id, String comment);

    int delete(int id);
}
