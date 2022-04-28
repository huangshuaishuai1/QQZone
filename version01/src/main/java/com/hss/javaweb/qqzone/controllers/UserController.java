package com.hss.javaweb.qqzone.controllers;

import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import com.hss.javaweb.qqzone.services.TopicService;
import com.hss.javaweb.qqzone.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller("user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    TopicService topicService;

    public String toLogin() {
        return "login";
    }
    public String login(String loginId, String pwd, HttpSession session) {
        UserBasic login = userService.login(loginId, pwd);
        if (login != null) {
            List<UserBasic> fridentList = userService.getFriendList(login);
            List<Topic> topicList = topicService.getTopicList(login);
            login.setFriendsList(fridentList);
            login.setTopicList(topicList);
            session.setAttribute("userBasic",login);
            return "index";
        }else {
            return "login";
        }
    }
}
