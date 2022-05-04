package com.hss.javaweb.qqzone.controllers;

import com.hss.javaweb.qqzone.pojo.Reply;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import com.hss.javaweb.qqzone.services.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller("reply")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    public String addReply(String content, Integer topicId, HttpSession session) {
        UserBasic author = (UserBasic) session.getAttribute("userBasic");
        int id = author.getId();
        Reply reply = new Reply(content, LocalDateTime.now(), topicId, id);
        replyService.addReply(reply);
        return "redirect:topic.do?operate=topicDetail&id="+topicId;
    }
    public String delReply(Integer replyId, Integer topicId) {
        replyService.deleteReply(replyId);
        return "redirect:topic.do?operate=topicDetail&id="+topicId;
    }
}
