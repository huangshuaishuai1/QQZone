package com.hss.javaweb.qqzone.dao;

import com.hss.javaweb.qqzone.pojo.HostReply;
import com.hss.javaweb.qqzone.pojo.Reply;

public interface HostReplyDao {
    // 根据回复查找主人回复
    HostReply getHostReply(Reply reply);
    // 对回复添加主人回复
    void addHostReply(HostReply hostReply);
}
