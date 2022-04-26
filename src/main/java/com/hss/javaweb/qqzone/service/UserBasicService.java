package com.hss.javaweb.qqzone.service;

import com.hss.javaweb.qqzone.pojo.UserBasic;

public interface UserBasicService {
    UserBasic login(String loginId, String pwd);
}
