package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.EnterpriseAdministratorMapper;
import com.hunter95.springbootmybatis.mapper.EnterpriseMapper;
import com.hunter95.springbootmybatis.pojo.Enterprise;
import com.hunter95.springbootmybatis.pojo.EnterpriseAdministrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnterpriseAdministratorController {

    @Autowired
    private EnterpriseAdministratorMapper enterpriseAdministratorMapper;

    //查询所有企业管理员
    @GetMapping("/queryEnterpriseAdministratorList")
    public List<EnterpriseAdministrator> queryEnterpriseAdministratorList(){
        List<EnterpriseAdministrator> enterpriseAdministratorList=enterpriseAdministratorMapper.query();
        return enterpriseAdministratorList;
    }

    //根据企业号查询所有企业管理员
    @GetMapping("/queryEnterpriseAdministratorByEnterpriseList")
    public List<EnterpriseAdministrator> queryEnterpriseAdministratorByEnterpriseList(){
        List<EnterpriseAdministrator> enterpriseAdministratorList=enterpriseAdministratorMapper.queryByEnterprise(1);
        return enterpriseAdministratorList;
    }

    //根据企业管理员账号号查询
    @GetMapping("/queryEnterpriseAdministratorById")
    public EnterpriseAdministrator queryEnterpriseAdministratorById(){
        EnterpriseAdministrator enterpriseAdministrator=enterpriseAdministratorMapper.queryById("1001");
        return enterpriseAdministrator;
    }

    //添加企业管理员
    @GetMapping("/addEnterpriseAdministrator")
    public String addEnterpriseAdministrator(){
        enterpriseAdministratorMapper.insert(new EnterpriseAdministrator(
                "1001",
                1,
                "123456"));
        return "ok";
    }

    //修改密码
    @GetMapping("/updateEnterpriseAdministratorPassword")
    public String updateEnterpriseAdministratorPassword(){
        enterpriseAdministratorMapper.update_enterpriseAdministrator_password("1001","654321");
        return "ok";
    }

    //根据id删除企业管理员
    @GetMapping("/deleteEnterpriseAdministrator")
    public String deleteEnterpriseAdministrator(){
        enterpriseAdministratorMapper.delete("1001");
        return "ok";
    }

}
