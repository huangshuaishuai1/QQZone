package com.hss.javaweb.qqzone.services;

import com.hss.javaweb.qqzone.dao.TopicDao;
import com.hss.javaweb.qqzone.dao.UserBasicDao;
import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    TopicDao topicDao;
    @Autowired
    UserBasicDao userBasicDao;
    public List<Topic> getTopicList(UserBasic userBasic) {
        List<Topic> topicList = topicDao.getTopicList(userBasic);
        for (Topic t :
                topicList) {
            int author = t.getAuthor();
            UserBasic authorObj = userBasicDao.getUserBasicById(author);
            t.setAuthorObj(authorObj);
        }
        if (topicList != null) {
            return topicList;
        }else {
            return null;
        }
    }

    public Topic getTopicById(Integer id) {
        Topic topic = topicDao.getTopic(id);
        UserBasic authorObj = userBasicDao.getUserBasicById(topic.getAuthor());
        topic.setAuthorObj(authorObj);
        return topic;
    }
}
