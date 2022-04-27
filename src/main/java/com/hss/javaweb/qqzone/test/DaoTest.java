package com.hss.javaweb.qqzone.test;

import com.hss.javaweb.qqzone.dao.*;
import com.hss.javaweb.qqzone.dao.impl.*;
import com.hss.javaweb.qqzone.pojo.*;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

public class DaoTest {
    @Test
    public void testUserDetail1() {
        UserDetailDao userDetailDao = new UserDetailDaoImpl();
        UserDetail userDetail = userDetailDao.getUserDetail(1);
        System.out.println(userDetail.getEmail());
    }

    @Test
    public void testUserDetail() {
        UserDetailDao userDetailDao = new UserDetailDaoImpl();
        userDetailDao.addUserDetail(new UserDetail(1,"吉姆","1008","188@jim.com",LocalDateTime.now(),"11"));
    }

    @Test
    public void testHostReplyDao2() {
        HostReplyDao hostReplyDao = new HostReplyDaoImpl();
        HostReply hostReply = hostReplyDao.getHostReply(new Reply(3));
        System.out.println(hostReply.getContent());
    }

    @Test
    public void testHostReplyDao() {
        HostReplyDao hostReplyDao = new HostReplyDaoImpl();
        hostReplyDao.addHostReply(new HostReply(0,"你说啥呢你在",LocalDateTime.now(),1,3));
    }

    @Test
    public void testReplyDao3() {
        ReplyDao replyDap = new ReplyDaoImpl();
        replyDap.deleteReply(5);
    }


    @Test
    public void testReplyDao2() {
        ReplyDao replyDap = new ReplyDaoImpl();
        replyDap.addReply(new Reply(0,"回复10086",LocalDateTime.now(),4,8));
    }
    @Test
    public void testReplyDao() {
        ReplyDao replyDap = new ReplyDaoImpl();
        List<Reply> replyList = replyDap.getReplyList(new Topic(8));
        for (Reply r :
                replyList) {
            System.out.println(r.getContent());
        }
    }

    @Test
    public void testTopicDao4() {
        TopicDaoImpl topicDao = new TopicDaoImpl();
        Topic topic = topicDao.getTopic(14);
        System.out.println(topic.getContent());
    }

    @Test
    public void testTopicDao3() {
        TopicDaoImpl topicDao = new TopicDaoImpl();
        topicDao.deleteTopic(new Topic(13));
    }

    @Test
    public void testTopicDao2() {
        TopicDaoImpl topicDao = new TopicDaoImpl();
        List<Topic> topicList = topicDao.getTopicList(new UserBasic(1));
        for (Topic t :
                topicList) {
            System.out.println("content = " + t.getContent());
        }

    }
    @Test
    public void testTopicDao() {
        TopicDao topicDao = new TopicDaoImpl();
        topicDao.addTopic(new Topic(0,"这是一个测试的Topic","测试",LocalDateTime.now(),new UserBasic(1).getId()));
    }

    @Test
    public void testUserBasicDao() {
        UserBasicDao userBasicDao = new UserBasicDaoImpl();
        UserBasic userBasic = userBasicDao.getUserBasic("u001", "ok");
        System.out.println(userBasic.getNickName());
    }

    @Test
    public void testUserBasicDao2() {
        UserBasicDao userBasicDao = new UserBasicDaoImpl();
        List<UserBasic> userBasicList = userBasicDao.getUserBasicList(new UserBasic(1));
        for (UserBasic user:userBasicList) {
            System.out.println(user.getNickName());
        }
    }
}
