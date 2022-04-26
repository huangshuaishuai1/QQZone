package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.myssm.basedao.BaseDAO;
import com.hss.javaweb.qqzone.dao.UserBasicDao;
import com.hss.javaweb.qqzone.pojo.UserBasic;

import java.util.List;

public class UserBasicDaoImpl extends BaseDAO<UserBasic> implements UserBasicDao {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        return super.load("selec * from t_user_basic where loginId=? and pwd=?");
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "select fid from t_friend where uid=?";
        return super.executeQuery(sql,userBasic.getId());
    }
}
