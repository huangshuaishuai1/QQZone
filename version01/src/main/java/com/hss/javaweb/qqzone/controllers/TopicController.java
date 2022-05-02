package com.hss.javaweb.qqzone.controllers;

import com.hss.javaweb.qqzone.pojo.HostReply;
import com.hss.javaweb.qqzone.pojo.Reply;
import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.services.HostReplyService;
import com.hss.javaweb.qqzone.services.ReplyService;
import com.hss.javaweb.qqzone.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller("topic")
public class TopicController {
    @Autowired
    TopicService topicService;

    @Autowired
    ReplyService replyService;
    @Autowired
    HostReplyService hostReplyService;
    public String topicDetail(Integer id, HttpSession session) {
        Topic topic = topicService.getTopicById(id);
        List<Reply> replyList = replyService.getReplyList(topic);
        for (Reply r : replyList) {
            HostReply hostReply = hostReplyService.getHostReply(r);
            if (hostReply != null) {
                r.setHostReply(hostReply);
            }
        }
        topic.setReplyList(replyList);
        session.setAttribute("topicDetail",topic);
        return "detail";
    }
}
