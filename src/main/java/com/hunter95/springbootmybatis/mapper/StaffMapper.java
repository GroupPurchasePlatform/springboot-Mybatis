package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Enterprise;
import com.hunter95.springbootmybatis.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StaffMapper {

    List<Staff> query();

    List<Staff> queryByEnterpriseId(int id);

    Staff queryByStaffId(String id);

    int insert(Staff staff);

    //修改企业号
    int update_enterprise_id(String id,int enterprise_id);

    //修改姓名
    int update_staff_name(String id,String name);

    //修改密码
    int update_staff_password(String id,String psw);

    //修改昵称
    int update_staff_nickname(String id,String nickname);

    //修改用户头像
    int update_staff_head(String id,String head);

    //修改电话
    int update_staff_phoneNumber(String id,String phoneNumber);

    //修改地址
    int update_staff_address(String id,String address);

    //修改餐卡余额
    int update_staff_card(String id,double card);

    int delete(String id);
}
