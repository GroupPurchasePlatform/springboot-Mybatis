package com.hunter95.springbootmybatis.controll;

import com.hunter95.springbootmybatis.mapper.AnnouncementMapper;
import com.hunter95.springbootmybatis.mapper.LogMapper;
import com.hunter95.springbootmybatis.pojo.Announcement;
import com.hunter95.springbootmybatis.pojo.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {

    @Autowired
    private LogMapper logMapper;

    //查询所有日志
    @GetMapping("/queryLogList")
    public List<Log> queryLogList(){
        List<Log> logList=logMapper.query();
        return logList;
    }

    //根据日志id查询日志
    @GetMapping("/queryLogById")
    public Log queryLogById(){
        Log log=logMapper.queryByLogId(1);
        return log;
    }

    //根据管理员id查询日志
    @GetMapping("/queryByAdministratorId")
    public List<Log> queryByAdministratorId(){
        List<Log> log=logMapper.queryByAdministratorId(1);
        return log;
    }

    //添加日志
    @GetMapping("/addLog")
    public String addLog(){
        logMapper.insert(new Log(
                1,
                "123456",
                "删除",
                "删除铅笔商品",
                "2021/9/4"));
        return "ok";
    }

    //根据日志id删除日志
    @GetMapping("/deleteLogByLogId")
    public String deleteLogByLogId(){
        logMapper.deleteLogByLogId(1);
        return "ok";
    }

    //根据管理员id删除日志
    @GetMapping("/deleteLogByAdministratorId")
    public String deleteLogByAdministratorId(){
        logMapper.deleteLogByAdministratorId(1);
        return "ok";
    }

    //根据日志id和管理员id删除日志
    @GetMapping("/deleteLogByAdministratorIdAndLogId")
    public String deleteLogByAdministratorIdAndLogId(){
        logMapper.deleteLogByAdministratorIdAndLogId(1,1);
        return "ok";
    }
}
