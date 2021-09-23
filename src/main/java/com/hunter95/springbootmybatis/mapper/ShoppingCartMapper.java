package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Product;
import com.hunter95.springbootmybatis.pojo.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ShoppingCartMapper {

    List<ShoppingCart> query();

    List<ShoppingCart> queryBy(int id);

    int insert(ShoppingCart shoppingcart);

    //修改购物车商品名称
    int update_product_name(int product_id,String name);
    //修改购物车商品价格
    int update_product_price(int product_id,int price);
    //修改购物车商品库存
    int update_product_num(int product_id,int consumer_id,int num);
    //修改购物车商品封面图
    int update_product_surfacePlot(int id,String surfacePlot);
    //删除购物车
    int deleteShoppingCart(int id);
    //删除购物车中指定商品
    int deleteShoppingCartProduct(int product_id,int consumer_id);
}
