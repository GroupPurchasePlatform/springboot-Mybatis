package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.AnnouncementMapper;
import com.hunter95.springbootmybatis.mapper.ShopMapper;
import com.hunter95.springbootmybatis.pojo.Announcement;
import com.hunter95.springbootmybatis.pojo.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnnouncementController {

    @Autowired
    private AnnouncementMapper announcementMapper;

    //查询所有公告
    @GetMapping("/queryAnnouncementList")
    public List<Announcement> queryAnnouncementList(){
        List<Announcement> announcementList=announcementMapper.query();
        return announcementList;
    }

    //根据id查询公告
    @GetMapping("/queryAnnouncementById")
    public Announcement queryAnnouncementById(){
        Announcement announcement=announcementMapper.queryBy(1);
        return announcement;
    }
    //添加公告
    @GetMapping("/addAnnouncement")
    public String addAnnouncement(){
        announcementMapper.insert(new Announcement(
                1,
                1,
                "杂货店开张啦",
                "全场八八折！"));
        return "ok";
    }

    //修改公告标题
    @GetMapping("/updateAnnouncementTitle")
    public String updateAnnouncementTitle(){
        announcementMapper.update_announcement_title(1,"解忧杂货铺开张啦");
        return "ok";
    }

    //修改公告详情
    @GetMapping("/updateAnnouncementDetails")
    public String updateAnnouncementDetails(){
        announcementMapper.update_announcement_details(1,"修改后的公告详情");
        return "ok";
    }

    //根据id删除公告
    @GetMapping("/deleteAnnouncement")
    public String deleteAnnouncement(){
        announcementMapper.delete(1);
        return "ok";
    }

}
