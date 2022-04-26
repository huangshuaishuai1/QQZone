package com.hss.javaweb.qqzone.dao;

import com.hss.javaweb.qqzone.pojo.Reply;
import com.hss.javaweb.qqzone.pojo.Topic;

import java.util.List;

public interface ReplyDao {

    // 获取指定Topic的所有回复
    public List<Reply> getReplyList(Topic topic);

    // 添加回复
    public void addReply(Topic topic);
    // 删除回复
    public void deleteReply(Integer id);

}
