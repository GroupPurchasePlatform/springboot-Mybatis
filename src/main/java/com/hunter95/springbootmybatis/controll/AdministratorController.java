package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.AdministratorMapper;
import com.hunter95.springbootmybatis.mapper.EnterpriseAdministratorMapper;
import com.hunter95.springbootmybatis.pojo.Administrator;
import com.hunter95.springbootmybatis.pojo.EnterpriseAdministrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorMapper administratorMapper;

    //查询所有平台管理员
    @GetMapping("/queryAdministratorList")
    public List<Administrator> queryAdministratorList(){
        List<Administrator> administratorList=administratorMapper.query();
        return administratorList;
    }


    //根据平台管理员账号号查询
    @GetMapping("/queryAdministratorById")
    public Administrator queryAdministratorById(){
        Administrator administrator=administratorMapper.queryById("1001");
        return administrator;
    }

    //添加平台管理员
    @GetMapping("/addAdministrator")
    public String addEnterpriseAdministrator(){
        administratorMapper.insert(new Administrator(
                "1001",
                "123456"));
        return "ok";
    }

    //修改密码
    @GetMapping("/updateAdministratorPassword")
    public String updateAdministratorPassword(){
        administratorMapper.update_administrator_password("1001","654321");
        return "ok";
    }

    //根据id删除平台管理员
    @GetMapping("/deleteAdministrator")
    public String deleteAdministrator(){
        administratorMapper.delete("1001");
        return "ok";
    }

}
