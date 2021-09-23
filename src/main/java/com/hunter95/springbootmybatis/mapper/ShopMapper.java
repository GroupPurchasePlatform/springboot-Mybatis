package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Product;
import com.hunter95.springbootmybatis.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShopMapper {

    List<Shop> query();

    Shop queryBy(int id);

    int insert(Shop shop);

    //修改店铺名称
    int update_shop_name(int id,String name);
    //修改店铺头像
    int update_shop_head(int id,String head);
    //修改店铺二维码
    int update_shop_QRcode(int id,String QRcode);

    int delete(int id);
}
