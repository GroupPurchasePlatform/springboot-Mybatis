package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Enterprise;
import com.hunter95.springbootmybatis.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EnterpriseMapper {

    List<Enterprise> query();

    Enterprise queryBy(int id);

    int insert(Enterprise enterprise);

    //修改企业名称
    int update_enterprise_name(int id,String name);

    int delete(int id);
}
