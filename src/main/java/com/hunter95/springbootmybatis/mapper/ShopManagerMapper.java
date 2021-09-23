package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.EnterpriseAdministrator;
import com.hunter95.springbootmybatis.pojo.ShopManager;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShopManagerMapper {

    List<ShopManager> query();

    //根据店铺号查询所有店铺管理员
    List<ShopManager> queryByShop(int id);

    //根据店铺管理员账号号查询
    ShopManager queryById(String id);

    int insert(ShopManager shopManager);

    //修改密码
    int update_shopManager_password(String id,String psw);

    int delete(String id);
}
