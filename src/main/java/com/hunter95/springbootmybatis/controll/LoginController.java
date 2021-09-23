package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.AdministratorMapper;
import com.hunter95.springbootmybatis.mapper.ProductMapper;
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

    @GetMapping("/staff")
    public LoginMessage StaffLogin(@RequestParam String username, @RequestParam String password){
        List<Staff> Stafflist=staffMapper.query();
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            LoginMessage L=new LoginMessage("400","");
            return L;
        }
        for (Staff u:
        Stafflist){
            if(username.equals(u.getStaff_id()) && password.equals(u.getStaff_password())){
                String t=Token.token(username,password);
                LoginMessage L=new LoginMessage("401",t);
                return L;
            }
        }
        LoginMessage L=new LoginMessage("402","");
        return L;
    }

    @GetMapping("/administrator")
    public LoginMessage AdministratorLogin(@RequestParam String username, @RequestParam String password){
        List<Administrator> Administratorlist=administratorMapper.query();
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            LoginMessage L=new LoginMessage("400","");
            return L;
        }
        for (Administrator u:
                Administratorlist){
            if(username.equals(u.getAdministrator_id()) && password.equals(u.getAdministrator_password())){
                String t=Token.token(username,password);
                LoginMessage L=new LoginMessage("401",t);
                return L;
            }
        }
        LoginMessage L=new LoginMessage("402","");
        return L;
    }

    @GetMapping("/shopmanager")
    public LoginMessage ShopmanagerLogin(@RequestParam String username, @RequestParam String password){
        List<ShopManager> shopManagerList=shopManagerMapper.query();
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            LoginMessage L=new LoginMessage("400","");
            return L;
        }
        for (ShopManager u:
                shopManagerList){
            if(username.equals(u.getShopManager_id()) && password.equals(u.getShopManager_password())){
                String t=Token.token(username,password);
                LoginMessage L=new LoginMessage("401",t);
                return L;
            }
        }
        LoginMessage L=new LoginMessage("402","");
        return L;
    }
}
