package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Enterprise;
import com.hunter95.springbootmybatis.pojo.EnterpriseAdministrator;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EnterpriseAdministratorMapper {

    List<EnterpriseAdministrator> query();

    //根据企业号查询所有企业管理员
    List<EnterpriseAdministrator> queryByEnterprise(int id);

    //根据企业管理员账号号查询
    EnterpriseAdministrator queryById(String id);

    int insert(EnterpriseAdministrator enterpriseAdministrator);

    //修改密码
    int update_enterpriseAdministrator_password(String id,String psw);

    int delete(String id);
}
