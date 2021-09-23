package com.hunter95.springbootmybatis.service;

import com.hunter95.springbootmybatis.mapper.ProductMapper;
import com.hunter95.springbootmybatis.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductMapper ud;
    //插入
    public int insert(Product u){
        return ud.insert(u);
    }
    //删除
    public int delete(int id){
        return ud.delete(id);
    }
    //修改
    public int update_product_name(int id,String name){
        return ud.update_product_name(id,name);
    }
    //查询all
    public List<Product> query(){
        return ud.query();
    }
    //条件查询
    public Product queryBy(int c){
        return ud.queryBy(c);
    }
}
