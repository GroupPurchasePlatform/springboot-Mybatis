package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.ConsumerMapper;
import com.hunter95.springbootmybatis.pojo.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerMapper consumerMapper;

    //查询所有员工员工
    @GetMapping("/queryConsumerList")
    public List<Consumer> queryConsumerList(){
        List<Consumer> consumerList=consumerMapper.query();
        return consumerList;
    }

    //根据id查询员工员工
    @GetMapping("/queryConsumerById")
    public Consumer queryConsumerById(){
        Consumer consumer=consumerMapper.queryByConsumerId(1);
        return consumer;
    }
    //添加员工员工
    @GetMapping("/addConsumer")
    public String addConsumer(){
        consumerMapper.insert(new Consumer(
                "1001",
                "lisi",
                "123456",
                "xiaoli",
                "头像123456",
                "10086",
                "浙江杭州"));
        return "ok";
    }
    

    //修改员工员工账号名称
    @GetMapping("/updateConsumerName")
    public String updateConsumerName(){
        consumerMapper.update_consumer_name("1001","李四");
        return "ok";
    }

    //修改员工员工账号密码
    @GetMapping("/updateConsumerPassword")
    public String updateConsumerPassword(){
        consumerMapper.update_consumer_password("1001","654321");
        return "ok";
    }

    //修改员工员工昵称
    @GetMapping("/updateConsumerNickname")
    public String updateConsumerNickname(){
        consumerMapper.update_consumer_nickname("1001","小李");
        return "ok";
    }

    //修改员工员工头像
    @GetMapping("/updateConsumerHead")
    public String updateConsumerHead(){
        consumerMapper.update_consumer_head("1001","新头像");
        return "ok";
    }

    //修改员工员工电话号码
    @GetMapping("/updateConsumerPhoneNumber")
    public String updateConsumerPhoneNumber(){
        consumerMapper.update_consumer_phoneNumber("1001","17693128028");
        return "ok";
    }

    //修改员工员工地址
    @GetMapping("/updateConsumerAddress")
    public String updateConsumerAddress(){
        consumerMapper.update_consumer_address("1001","浙江省杭州市余杭区");
        return "ok";
    }

    //根据id删除员工员工
    @GetMapping("/deleteConsumer")
    public String deleteConsumer(){
        consumerMapper.delete("1001");
        return "ok";
    }

}
