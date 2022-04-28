package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.qqzone.dao.BaseDao;
import com.hss.javaweb.qqzone.dao.HostReplyDao;
import com.hss.javaweb.qqzone.pojo.HostReply;
import com.hss.javaweb.qqzone.pojo.Reply;
import org.springframework.stereotype.Repository;

@Repository
public class HostReplyDaoImpl extends BaseDao<HostReply> implements HostReplyDao {
    @Override
    public HostReply getHostReply(Reply reply) {
        String sql = "select * from t_host_reply where reply = ?";
        return super.getSingleBean(sql,HostReply.class,reply.getId());
    }

    @Override
    public void addHostReply(HostReply hostReply) {
        String sql = "insert into t_host_reply (id, content, hostReplyDate, author, reply) values(0,?,?,?,?)";
        super.update(sql,hostReply.getContent(),hostReply.getHostReplyDate(),hostReply.getAuthor(),hostReply.getReply());
    }
}
