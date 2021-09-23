package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.ConsumerOrderMapper;
import com.hunter95.springbootmybatis.pojo.ConsumerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerOrderController {

    @Autowired
    private ConsumerOrderMapper consumerOrderMapper;

    //查询所有订单
    @GetMapping("/queryConsumerOrderList")
    public List<ConsumerOrder> queryConsumerOrderList(){
        List<ConsumerOrder> consumerOrderList=consumerOrderMapper.query();
        return consumerOrderList;
    }

    //根据订单id查询订单
    @GetMapping("/queryByOrderId")
    public ConsumerOrder queryOrderByOrderId(){
        ConsumerOrder consumerOrder=consumerOrderMapper.queryByOrderId(1);
        return consumerOrder;
    }

    //根据商品id查询订单
    @GetMapping("/queryByProductId")
    public List<ConsumerOrder> queryOrderByProductId(){
        List<ConsumerOrder> consumerOrderList=consumerOrderMapper.queryByProductId(1);
        return consumerOrderList;
    }

    //根据普通用户id查询订单
    @GetMapping("/queryOrderByConsumerId")
    public List<ConsumerOrder> queryOrderByConsumerId(){
        List<ConsumerOrder> consumerOrderList=consumerOrderMapper.queryByConsumerId("1001");
        return consumerOrderList;
    }

    //添加订单
    @GetMapping("/addConsumerOrder")
    public String addConsumerOrder(){
        consumerOrderMapper.insert(new ConsumerOrder(
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
    @GetMapping("/updateConsumerOrderNickname")
    public String updateConsumerOrderNickname(){
        consumerOrderMapper.update_consumer_nickname(1,"张三");
        return "ok";
    }

    //修改电话号码
    @GetMapping("/updateConsumerOrderPhoneNumber")
    public String updateConsumerOrderPhoneNumber(){
        consumerOrderMapper.update_consumer_phoneNumber(1,"10086");
        return "ok";
    }

    //修改地址
    @GetMapping("/updateConsumerOrderAddress")
    public String updateConsumerOrderAddress(){
        consumerOrderMapper.update_consumer_address(1,"浙江省杭州市西湖区");
        return "ok";
    }

    //修改订单状态
    @GetMapping("/updateConsumerOrderStatus")
    public String updateConsumerOrderStatus(){
        consumerOrderMapper.update_order_status(1,"送达");
        return "ok";
    }

    //修改备注
    @GetMapping("/updateConsumerOrderComment")
    public String updateConsumerOrderComment(){
        consumerOrderMapper.update_order_comment(1,"谢谢");
        return "ok";
    }


    //根据id删除订单
    @GetMapping("/deleteConsumerOrder")
    public String deleteConsumerOrder(){
        consumerOrderMapper.delete(1);
        return "ok";
    }

}
