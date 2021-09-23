package com.hunter95.springbootmybatis.service;

import com.hunter95.springbootmybatis.mapper.UserMapper;
import com.hunter95.springbootmybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper ud;
    //插入
    public int insert(User u){
        return ud.insert(u);
    }
    //删除
    public int delete(int id){
        return ud.delete(id);
    }
    //修改
    public int update(User u){
        return ud.update(u);
    }
    //查询all
    public List<User> query(){
        return ud.query();
    }
    //条件查询
    public User queryBy(int c){
        return ud.queryBy(c);
    }
}
