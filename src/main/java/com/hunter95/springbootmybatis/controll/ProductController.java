package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.ProductMapper;
import com.hunter95.springbootmybatis.mapper.UserMapper;
import com.hunter95.springbootmybatis.pojo.Product;
import com.hunter95.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    //查询所有商品
    @GetMapping("/queryProductList")
    @ResponseBody
    public List<Product> queryProductList(){
        List<Product> productList=productMapper.query();
        return productList;
    }

    //根据id查询商品
    @GetMapping("/queryProductById")
    public Product queryProductById(){
        Product product=productMapper.queryBy(1);
        return product;
    }
    //添加商品
    @GetMapping("/addProduct")
    public String addProduct(){
        productMapper.insert(new Product(
                1,
                1,
                "pen",
                1.5,
                "published",
                100,
                "stationery",
                "支",
                "这是一支笔",
                "surfacePlot123",
                "slideshow123",
                1,
                "QRcode123"));
        return "ok";
    }

    //修改商品名称
    @GetMapping("/updateProductName")
    public String updateProductName(){
        productMapper.update_product_name(1,"铅笔");
        return "ok";
    }

    //修改商品价格
    @GetMapping("/updateProductPrice")
    public String updateProductPrice(){
        productMapper.update_product_price(1,2);
        return "ok";
    }

    //修改商品状态
    @GetMapping("/updateProductStatus")
    public String updateProductStatus(){
        productMapper.update_product_status(1,"down");
        return "ok";
    }

    //修改商品库存
    @GetMapping("/updateProductInventory")
    public String updateProductInventory(){
        productMapper.update_product_inventory(1,99);
        return "ok";
    }

    //修改商品类型
    @GetMapping("/updateProductType")
    public String updateProductType(){
        productMapper.update_product_type(1,"文具");
        return "ok";
    }

    //修改商品规格
    @GetMapping("/updateProductSpecification")
    public String updateProductSpecification(){
        productMapper.update_product_specification(1,"件");
        return "ok";
    }

    //修改商品简介
    @GetMapping("/updateProductDescript")
    public String updateProductDescript(){
        productMapper.update_product_descript(1,"这是一只中华铅笔");
        return "ok";
    }

    //修改商品封面图
    @GetMapping("/updateProductSurfacePlot")
    public String updateProductSurfacePlot(){
        productMapper.update_product_surfacePlot(1,"铅笔封面图");
        return "ok";
    }

    //修改商品轮播图
    @GetMapping("/updateProductSlideshow")
    public String updateProductSlideshow(){
        productMapper.update_product_slideshow(1,"铅笔轮播图");
        return "ok";
    }

    //修改商品是否开启评论
    @GetMapping("/updateProductIsComment")
    public String updateProductIsComment(){
        productMapper.update_product_isComment(1,0);
        return "ok";
    }

    //修改商品二维码
    @GetMapping("/updateProductQRcode")
    public String updateProductQRcode(){
        productMapper.update_product_QRcode(1,"铅笔二维码");
        return "ok";
    }

    //根据id删除商品
    @GetMapping("/deleteProduct")
    public String deleteProduct(){
        productMapper.delete(1);
        return "ok";
    }

}
