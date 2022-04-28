package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.myssm.basedao.BaseDao;
import com.hss.javaweb.qqzone.dao.TopicDao;
import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopicDaoImpl extends BaseDao<Topic> implements TopicDao {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.getAllBeans("select * from t_topic where author=?",Topic.class,userBasic.getId());
    }


    @Override
    public void addTopic(Topic topic) {
        String sql = "insert into t_topic (id,title,content,topicDate,author) VALUES(0,?,?,?,?)";
        super.update(sql,topic.getTitle(),topic.getContent(),topic.getTopicDate(),topic.getAuthor());
    }

    @Override
    public void deleteTopic(Topic topic) {
        String sql = "DELETE FROM t_topic where id=?";
        super.update(sql,topic.getId());
    }

    @Override
    public Topic getTopic(Integer id) {
        String sql = "select * from t_topic where id=?";
        return super.getSingleBean(sql,Topic.class,id);
    }
}
