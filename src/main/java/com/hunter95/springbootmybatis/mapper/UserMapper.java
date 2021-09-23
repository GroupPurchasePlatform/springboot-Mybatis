package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//mybatis的mapper类
@Mapper
@Repository
public interface UserMapper {

    List<User> query();

    User queryBy(int id);

    int insert(User user);

    int update(User user);

    int delete(int id);
}
