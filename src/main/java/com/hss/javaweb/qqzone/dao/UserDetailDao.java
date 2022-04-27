package com.hss.javaweb.qqzone.dao;

import com.hss.javaweb.qqzone.pojo.UserBasic;
import com.hss.javaweb.qqzone.pojo.UserDetail;

public interface UserDetailDao {
    // 为指定用户加详细信息
    public void addUserDetail(UserDetail userDetail);

    // 根据id查看详细信息
    UserDetail getUserDetail(Integer id);
}
