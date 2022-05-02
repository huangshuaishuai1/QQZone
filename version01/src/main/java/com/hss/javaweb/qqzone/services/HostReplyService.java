package com.hss.javaweb.qqzone.services;

import com.hss.javaweb.qqzone.dao.HostReplyDao;
import com.hss.javaweb.qqzone.pojo.HostReply;
import com.hss.javaweb.qqzone.pojo.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostReplyService {

    @Autowired
    HostReplyDao hostReplyDao;

    public HostReply getHostReply(Reply reply) {
        HostReply hostReply = hostReplyDao.getHostReply(reply);
        return hostReply;
    }

}
