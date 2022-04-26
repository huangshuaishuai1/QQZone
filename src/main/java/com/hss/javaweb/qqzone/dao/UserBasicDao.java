package com.hss.javaweb.qqzone.dao;

import com.hss.javaweb.qqzone.pojo.Topic;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import com.hss.javaweb.qqzone.pojo.UserDetail;

import java.util.List;

public interface UserBasicDao {
//   根据账号和密码获取特定用户信息
    public UserBasic getUserBasic(String loginId, String pwd);

    // 获取指定用户的所有好友列表
    public List<UserBasic> getUserBasicList(UserBasic userBasic);



}
