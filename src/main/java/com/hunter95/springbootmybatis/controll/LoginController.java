package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.AdministratorMapper;
import com.hunter95.springbootmybatis.mapper.ShopManagerMapper;
import com.hunter95.springbootmybatis.mapper.StaffMapper;
import com.hunter95.springbootmybatis.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge=3600)
@RestController
@RequestMapping(value = "/login",method = RequestMethod.POST)
public class LoginController {
    @Autowired
    private StaffMapper staffMapper;
    @Autowired
    private AdministratorMapper administratorMapper;
    @Autowired
    private ShopManagerMapper shopManagerMapper;

    Staff s=new Staff();
    Administrator a=new Administrator();
    ShopManager m=new ShopManager();
    @GetMapping("/staff")
    public StaffLoginMessage StaffLogin(@RequestParam String username, @RequestParam String password){
        List<Staff> Stafflist=staffMapper.query();
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            StaffLoginMessage L=new StaffLoginMessage("400","",s);
            return L;
        }
        for (Staff u:
        Stafflist){
            if(username.equals(u.getStaff_id()) && password.equals(u.getStaff_password())){
                String t=Token.token(username,password);
                StaffLoginMessage L=new StaffLoginMessage("401",t,u);
                return L;
            }
        }
        StaffLoginMessage L=new StaffLoginMessage("402","",s);
        return L;
    }

    @GetMapping("/administrator")
    public AdministratorLoginMessage AdministratorLogin(@RequestParam String username, @RequestParam String password){
        List<Administrator> Administratorlist=administratorMapper.query();
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            AdministratorLoginMessage L=new AdministratorLoginMessage("400","",a);
            return L;
        }
        for (Administrator u:
                Administratorlist){
            if(username.equals(u.getAdministrator_id()) && password.equals(u.getAdministrator_password())){
                String t=Token.token(username,password);
                AdministratorLoginMessage L=new AdministratorLoginMessage("401",t,u);
                return L;
            }
        }
        AdministratorLoginMessage L=new AdministratorLoginMessage("402","",a);
        return L;
    }

    @GetMapping("/shopmanager")
    public ShopManagerLoginMessage ShopmanagerLogin(@RequestParam String username, @RequestParam String password){
        List<ShopManager> shopManagerList=shopManagerMapper.query();
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            ShopManagerLoginMessage L=new ShopManagerLoginMessage("400","",m);
            return L;
        }
        for (ShopManager u:
                shopManagerList){
            if(username.equals(u.getShopManager_id()) && password.equals(u.getShopManager_password())){
                String t=Token.token(username,password);
                ShopManagerLoginMessage L=new ShopManagerLoginMessage("401",t,u);
                return L;
            }
        }
        ShopManagerLoginMessage L=new ShopManagerLoginMessage("402","",m);
        return L;
    }
}
