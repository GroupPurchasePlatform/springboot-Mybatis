package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.ProductMapper;
import com.hunter95.springbootmybatis.mapper.ShopMapper;
import com.hunter95.springbootmybatis.pojo.Product;
import com.hunter95.springbootmybatis.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopController {

    @Autowired
    private ShopMapper shopMapper;

    //查询所有店铺
    @GetMapping("/queryShopList")
    public List<Shop> queryProductList(){
        List<Shop> shopList=shopMapper.query();
        return shopList;
    }

    //根据id查询店铺
    @GetMapping("/queryShopById")
    public Shop queryShopById(){
        Shop shop=shopMapper.queryBy(1);
        return shop;
    }
    //添加店铺
    @GetMapping("/addShop")
    public String addShop(){
        shopMapper.insert(new Shop(
                1,
                "杂货店",
                "杂货店head",
                "QRcode123"));
        return "ok";
    }

    //修改店铺名称
    @GetMapping("/updateShopName")
    public String updateShopName(){
        shopMapper.update_shop_name(1,"解忧杂货铺");
        return "ok";
    }

    //修改店铺头像
    @GetMapping("/updateShopHead")
    public String updateShopHead(){
        shopMapper.update_shop_head(1,"修改后的头像");
        return "ok";
    }

    //修改店铺二维码
    @GetMapping("/updateShopQRcode")
    public String updateShopQRcode(){
        shopMapper.update_shop_QRcode(1,"修改后的二维码");
        return "ok";
    }

    //根据id删除店铺
    @GetMapping("/deleteShop")
    public String deleteShop(){
        shopMapper.delete(1);
        return "ok";
    }

}
