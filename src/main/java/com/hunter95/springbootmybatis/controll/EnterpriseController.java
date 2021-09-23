package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.EnterpriseMapper;
import com.hunter95.springbootmybatis.mapper.ShopMapper;
import com.hunter95.springbootmybatis.pojo.Enterprise;
import com.hunter95.springbootmybatis.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseController {

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    //查询所有企业
    @GetMapping("/queryEnterpriseList")
    public List<Enterprise> queryEnterpriseList(){
        List<Enterprise> enterpriseList=enterpriseMapper.query();
        return enterpriseList;
    }

    //根据id查询企业
    @GetMapping("/queryEnterpriseById")
    public Enterprise queryEnterpriseById(){
        Enterprise enterprise=enterpriseMapper.queryBy(1);
        return enterprise;
    }
    //添加企业
    @GetMapping("/addEnterprise")
    public String addEnterprise(){
        enterpriseMapper.insert(new Enterprise(
                1,
                "拼多多"));
        return "ok";
    }

    //修改企业名称
    @GetMapping("/updateEnterpriseName")
    public String updateEnterpriseName(){
        enterpriseMapper.update_enterprise_name(1,"并夕夕");
        return "ok";
    }

    //根据id删除企业
    @GetMapping("/deleteEnterprise")
    public String deleteEnterprise(){
        enterpriseMapper.delete(1);
        return "ok";
    }

}
