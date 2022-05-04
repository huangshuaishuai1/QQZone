package com.hss.javaweb.qqzone.services;

import com.hss.javaweb.qqzone.dao.ReplyDao;
import com.hss.javaweb.qqzone.dao.UserBasicDao;
import com.hss.javaweb.qqzone.pojo.Reply;
import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyService {
    @Autowired
    ReplyDao replyDao;
    @Autowired
    UserBasicDao userBasicDao;
    public List<Reply> getReplyList(Topic topic) {
        List<Reply> replyList = replyDao.getReplyList(topic);
        for (Reply r :
                replyList) {
            int id = r.getAuthor();
            UserBasic author = userBasicDao.getUserBasicById(id);
            r.setAuthorObj(author);
        }
        return replyList;
    }

    public void addReply(Reply reply){
        replyDao.addReply(reply);
    }
    public void deleteReply(Integer id) {
        replyDao.deleteReply(id);
    }
}
