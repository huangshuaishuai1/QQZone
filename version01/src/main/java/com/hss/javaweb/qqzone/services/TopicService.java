package com.hss.javaweb.qqzone.services;

import com.hss.javaweb.qqzone.dao.TopicDao;
import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    TopicDao topicDao;
    public List<Topic> getTopicList(UserBasic userBasic) {
        List<Topic> topicList = topicDao.getTopicList(userBasic);
        if (topicList != null) {
            return topicList;
        }else {
            return null;
        }
    }
}
