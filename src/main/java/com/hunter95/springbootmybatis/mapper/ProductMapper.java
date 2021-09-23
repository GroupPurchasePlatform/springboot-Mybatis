package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProductMapper {

    List<Product> query();

    Product queryBy(int id);

    int insert(Product product);

    //修改商品名称
    int update_product_name(int id,String name);
    //修改商品价格
    int update_product_price(int id,int price);
    //修改商品状态
    int update_product_status(int id,String status);
    //修改商品库存
    int update_product_inventory(int id,int inventory);
    //修改商品类型
    int update_product_type(int id,String type);
    //修改商品规格
    int update_product_specification(int id,String specification);
    //修改商品简介
    int update_product_descript(int id,String descript);
    //修改商品封面图
    int update_product_surfacePlot(int id,String surfacePlot);
    //修改商品轮播图
    int update_product_slideshow(int id,String slideshow);
    //修改商品是否开启评论
    int update_product_isComment(int id,int isComment);
    //修改商品二维码
    int update_product_QRcode(int id,String QRcode);

    int delete(int id);
}
