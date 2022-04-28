package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.qqzone.dao.BaseDao;
import com.hss.javaweb.qqzone.dao.UserBasicDao;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserBasicDaoImpl extends BaseDao<UserBasic> implements UserBasicDao {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        String sql = "select * from t_user_basic where loginId=? and pwd=?";
        return super.getSingleBean(sql,UserBasic.class,loginId,pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "select id, loginId, nickName, pwd, headImg from t_user_basic where id = any(select fid from t_friend where uid = ?)";
        return super.getAllBeans(sql,UserBasic.class,userBasic.getId());
    }

}
