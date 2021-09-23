package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.StaffMapper;
import com.hunter95.springbootmybatis.mapper.StaffOrderMapper;
import com.hunter95.springbootmybatis.pojo.Staff;
import com.hunter95.springbootmybatis.pojo.StaffOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffOrderController {

    @Autowired
    private StaffOrderMapper staffOrderMapper;

    //查询所有订单
    @GetMapping("/queryStaffOrderList")
    public List<StaffOrder> queryStaffOrderList(){
        List<StaffOrder> staffOrderList=staffOrderMapper.query();
        return staffOrderList;
    }

    //根据订单id查询订单
    @GetMapping("/queryByStaffOrderId")
    public StaffOrder queryOrderByOrderId(){
        StaffOrder staffOrder=staffOrderMapper.queryByOrderId(1);
        return staffOrder;
    }

    //根据商品id查询订单
    @GetMapping("/queryByStaffProductId")
    public List<StaffOrder> queryOrderByProductId(){
        List<StaffOrder> staffOrderList=staffOrderMapper.queryByProductId(1);
        return staffOrderList;
    }

    //根据企业员工id查询订单
    @GetMapping("/queryOrderByStaffId")
    public List<StaffOrder> queryOrderByStaffId(){
        List<StaffOrder> staffOrderList=staffOrderMapper.queryByStaffId("1001");
        return staffOrderList;
    }

    //添加订单
    @GetMapping("/addStaffOrder")
    public String addStaffOrder(){
        staffOrderMapper.insert(new StaffOrder(
                1,
                1,
                "1001",
                "xiaozhang",
                "17693128028",
                "浙江杭州",
                "2021/9/5",
                100,
                "运输",
                "支付宝",
                "小心运输"));
        return "ok";
    }

    //修改昵称
    @GetMapping("/updateStaffOrderNickname")
    public String updateStaffOrderNickname(){
        staffOrderMapper.update_staff_nickname(1,"张三");
        return "ok";
    }

    //修改电话号码
    @GetMapping("/updateStaffOrderPhoneNumber")
    public String updateStaffOrderPhoneNumber(){
        staffOrderMapper.update_staff_phoneNumber(1,"10086");
        return "ok";
    }

    //修改地址
    @GetMapping("/updateStaffOrderAddress")
    public String updateStaffOrderAddress(){
        staffOrderMapper.update_staff_address(1,"浙江省杭州市西湖区");
        return "ok";
    }

    //修改订单状态
    @GetMapping("/updateStaffOrderStatus")
    public String updateStaffOrderStatus(){
        staffOrderMapper.update_order_status(1,"送达");
        return "ok";
    }

    //修改备注
    @GetMapping("/updateStaffOrderComment")
    public String updateStaffOrderComment(){
        staffOrderMapper.update_order_comment(1,"谢谢");
        return "ok";
    }


    //根据id删除订单
    @GetMapping("/deleteStaffOrder")
    public String deleteStaffOrder(){
        staffOrderMapper.delete(1);
        return "ok";
    }

}
