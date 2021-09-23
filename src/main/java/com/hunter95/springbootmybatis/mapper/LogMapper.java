package com.hunter95.springbootmybatis.mapper;

import com.hunter95.springbootmybatis.pojo.Announcement;
import com.hunter95.springbootmybatis.pojo.Log;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LogMapper {

    List<Log> query();

    Log queryByLogId(int id);

    List<Log> queryByAdministratorId(int id);

    int insert(Log log);

    int deleteLogByLogId(int log_id);
    int deleteLogByAdministratorId(int administrator_id);
    int deleteLogByAdministratorIdAndLogId(int administrator_id,int log_id);
}
