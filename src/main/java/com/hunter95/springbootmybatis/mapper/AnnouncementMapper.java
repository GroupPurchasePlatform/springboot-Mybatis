package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Announcement;
import com.hunter95.springbootmybatis.pojo.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AnnouncementMapper {

    List<Announcement> query();

    Announcement queryBy(int id);

    int insert(Announcement announcement);

    //修改公告标题
    int update_announcement_title(int id,String title);
    //修改公告详情
    int update_announcement_details(int id,String details);

    int delete(int id);
}
