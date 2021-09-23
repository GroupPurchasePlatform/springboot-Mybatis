package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Administrator;
import com.hunter95.springbootmybatis.pojo.EnterpriseAdministrator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdministratorMapper {

    List<Administrator> query();

    Administrator queryById(String id);

    int insert(Administrator administrator);

    //修改密码
    int update_administrator_password(String id,String psw);

    int delete(String id);
}
