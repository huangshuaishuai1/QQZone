package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.qqzone.dao.BaseDao;
import com.hss.javaweb.qqzone.dao.ReplyDao;
import com.hss.javaweb.qqzone.pojo.Reply;
import com.hss.javaweb.qqzone.pojo.Topic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReplyDaoImpl extends BaseDao<Reply> implements ReplyDao {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        String sql = "select * from t_reply where topic=?";
        return super.getAllBeans(sql, Reply.class, topic.getId());

    }

    @Override
    public void addReply(Reply reply) {
        String sql = "insert into t_reply (id,content,replyDate,author,topic) VALUES(0,?,?,?,?)";
        super.update(sql,reply.getContent(),reply.getReplyDate(),reply.getAuthor(),reply.getTopic());
    }

    @Override
    public void deleteReply(Integer id) {
        String sql = "delete from t_reply where id = ?";
        super.update(sql,id);
    }
}
