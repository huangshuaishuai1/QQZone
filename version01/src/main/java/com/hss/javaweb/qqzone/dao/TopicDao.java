package com.hss.javaweb.qqzone.dao;

import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;

import java.util.List;

public interface TopicDao {
    // 获取指定用户的所有日志
    public List<Topic> getTopicList(UserBasic userBasic);
    //添加日志
    public void addTopic(Topic topic);
    //删除日志
    public void deleteTopic(Topic topic);
    // 获取特定日志的信息
    public Topic getTopic(Integer id);
}
