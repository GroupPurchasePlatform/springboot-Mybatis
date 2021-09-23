package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.ProductMapper;
import com.hunter95.springbootmybatis.mapper.ShoppingCartMapper;
import com.hunter95.springbootmybatis.pojo.Product;
import com.hunter95.springbootmybatis.pojo.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingCartController {

    @Autowired
    private ShoppingCartMapper shoppingcartMapper;

    //查询购物车所有商品
    @GetMapping("/queryShoppingCartList")
    public List<ShoppingCart> queryShoppingCartList(){
        List<ShoppingCart> shoppingcartList=shoppingcartMapper.query();
        return shoppingcartList;
    }

    //根据用户id查询购物车
    @GetMapping("/queryShoppingCartById")
    public List<ShoppingCart> queryShoppingCartById(){
        List<ShoppingCart> shoppingcart=shoppingcartMapper.queryBy(1);
        return shoppingcart;
    }

    //给购物车添加商品
    @GetMapping("/addShoppingCart")
    public String addShoppingCart(){
        shoppingcartMapper.insert(new ShoppingCart(
                2,
                1,
                "pen",
                1.5,
                100,
                "surfacePlot123"));
        return "ok";
    }

    //修改购物车商品名称
    @GetMapping("/updateShoppingCartProductName")
    public String updateShoppingCartProductName(){
        shoppingcartMapper.update_product_name(1,"铅笔");
        return "ok";
    }

    //修改购物车商品价格
    @GetMapping("/updateShoppingCartProductPrice")
    public String updateShoppingCartProductPrice(){
        shoppingcartMapper.update_product_price(1,2);
        return "ok";
    }


    //修改购物车商品数量
    @GetMapping("/updateShoppingCartProductNum")
    public String updateShoppingCartProductNum(){
        shoppingcartMapper.update_product_num(1,1,99);
        return "ok";
    }

    //修改购物车商品封面图
    @GetMapping("/updateShoppingCartProductSurfacePlot")
    public String updateShoppingCartProductSurfacePlot(){
        shoppingcartMapper.update_product_surfacePlot(1,"铅笔封面图");
        return "ok";
    }

    //根据用户id删除购物车
    @GetMapping("/deleteShoppingCart")
    public String deleteShoppingCart(){
        shoppingcartMapper.deleteShoppingCart(1);
        return "ok";
    }

    //根据用户id和商品id删除购物车中的商品
    @GetMapping("/deleteShoppingCartProduct")
    public String deleteShoppingCartProduct(){
        shoppingcartMapper.deleteShoppingCartProduct(1,1);
        return "ok";
    }

}
