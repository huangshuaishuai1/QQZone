package com.hss.javaweb.qqzone.services;

import com.hss.javaweb.qqzone.dao.UserBasicDao;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserBasicDao userBasicDao;
    public UserBasic login(String loginId, String pwd) {
        UserBasic userBasic = userBasicDao.getUserBasic(loginId, pwd);
        if (userBasic != null) {
            return userBasic;
        }
        else {
            return null;
        }
    }
    public List<UserBasic> getFriendList(UserBasic user) {
        List<UserBasic> userBasicList = userBasicDao.getUserBasicList(user);
        if (userBasicList != null) {
            return userBasicList;
        }else {
            return null;
        }
    }
}
