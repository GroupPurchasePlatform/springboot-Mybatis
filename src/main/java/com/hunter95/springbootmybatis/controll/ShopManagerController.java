package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.EnterpriseAdministratorMapper;
import com.hunter95.springbootmybatis.mapper.ShopManagerMapper;
import com.hunter95.springbootmybatis.pojo.EnterpriseAdministrator;
import com.hunter95.springbootmybatis.pojo.ShopManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShopManagerController {

    @Autowired
    private ShopManagerMapper shopManagerMapper;

    //查询所有店铺管理员
    @GetMapping("/queryShopManagerList")
    public List<ShopManager> queryShopManagerList(){
        List<ShopManager> shopManagerList=shopManagerMapper.query();
        return shopManagerList;
    }

    //根据店铺号查询所有店铺管理员
    @GetMapping("/queryShopManagerByShopList")
    public List<ShopManager> queryShopManagerByShopList(){
        List<ShopManager> shopManagerList=shopManagerMapper.queryByShop(1);
        return shopManagerList;
    }

    //根据店铺管理员账号号查询
    @GetMapping("/queryShopManagerById")
    public ShopManager queryShopManagerById(){
        ShopManager shopManager=shopManagerMapper.queryById("1001");
        return shopManager;
    }

    //添加店铺管理员
    @GetMapping("/addShopManager")
    public String addShopManager(){
        shopManagerMapper.insert(new ShopManager(
                "1001",
                1,
                "123456"));
        return "ok";
    }

    //修改密码
    @GetMapping("/updateShopManagerPassword")
    public String updateShopManagerPassword(){
        shopManagerMapper.update_shopManager_password("1001","654321");
        return "ok";
    }

    //根据id删除店铺管理员
    @GetMapping("/deleteShopManager")
    public String deleteShopManager(){
        shopManagerMapper.delete("1001");
        return "ok";
    }

}
