package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.EnterpriseMapper;
import com.hunter95.springbootmybatis.mapper.StaffMapper;
import com.hunter95.springbootmybatis.pojo.Enterprise;
import com.hunter95.springbootmybatis.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge=3600)
@RestController
@RequestMapping(value = "/staff",method = RequestMethod.POST)
public class StaffController {

    @Autowired
    private StaffMapper staffMapper;

    //查询所有企业员工
    @GetMapping("/queryStaffList")
    public List<Staff> queryStaffList(){
        List<Staff> staffList=staffMapper.query();
        return staffList;
    }

    //根据企业id查询企业员工
    @GetMapping("/queryEnterpriseIdList")
    public List<Staff> queryEnterpriseIdList(){
        List<Staff> staffList=staffMapper.queryByEnterpriseId(1);
        return staffList;
    }

    //根据id查询企业员工
    @GetMapping("/queryStaffById")
    public Staff queryStaffById(){
        Staff staff=staffMapper.queryByStaffId("1001");
        return staff;
    }
    //添加企业员工
    @GetMapping("/addStaff")
    public String addStaff(){
        staffMapper.insert(new Staff(
                "1001",
                "浙江工业大学",
                "zhangsan",
                "123456",
                "xiaozhang",
                "头像123456",
                "10086",
                "浙江杭州",
                1000));
        return "ok";
    }

    //修改企业员工的企业id
    @GetMapping("/updateStaffEnterpriseId")
    public String updateStaffEnterpriseId(){
        staffMapper.update_enterprise_id("1001",2);
        return "ok";
    }

    //修改企业员工账号名称
    @GetMapping("/updateStaffName")
    public String updateStaffName(){
        staffMapper.update_staff_name("1001","张三");
        return "ok";
    }

    //修改企业员工账号密码
    @GetMapping("/updateStaffPassword")
    public String updateStaffPassword(){
        staffMapper.update_staff_password("1001","654321");
        return "ok";
    }

    //修改企业员工昵称
    @GetMapping("/updateStaffNickname")
    public String updateStaffNickname(){
        staffMapper.update_staff_nickname("1001","小张");
        return "ok";
    }

    //修改企业员工头像
    @GetMapping("/updateStaffHead")
    public String updateStaffHead(){
        staffMapper.update_staff_head("1001","新头像");
        return "ok";
    }

    //修改企业员工电话号码
    @GetMapping("/updateStaffPhoneNumber")
    public String updateStaffPhoneNumber(){
        staffMapper.update_staff_phoneNumber("1001","17693128028");
        return "ok";
    }

    //修改企业员工地址
    @GetMapping("/updateStaffAddress")
    public String updateStaffAddress(){
        staffMapper.update_staff_address("1001","浙江省杭州市西湖区");
        return "ok";
    }

    //修改企业员工餐卡余额
    @GetMapping("/updateStaffCard")
    public String updateStaffCard(){
        staffMapper.update_staff_card("1001",2000);
        return "ok";
    }

    //根据id删除企业员工
    @GetMapping("/deleteStaff")
    public String deleteStaff(){
        staffMapper.delete("1001");
        return "ok";
    }

}
