package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.myssm.basedao.BaseDAO;
import com.hss.javaweb.qqzone.dao.ReplyDao;
import com.hss.javaweb.qqzone.pojo.Reply;
import com.hss.javaweb.qqzone.pojo.Topic;

import java.util.List;

public class ReplyDapImpl extends BaseDAO<Reply> implements ReplyDao {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return null;
    }

    @Override
    public void addReply(Topic topic) {

    }

    @Override
    public void deleteReply(Integer id) {

    }
}
