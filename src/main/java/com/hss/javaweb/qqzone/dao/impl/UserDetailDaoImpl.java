package com.hss.javaweb.qqzone.dao.impl;

import com.hss.javaweb.myssm.basedao.BaseDao;
import com.hss.javaweb.qqzone.dao.UserDetailDao;
import com.hss.javaweb.qqzone.pojo.UserBasic;
import com.hss.javaweb.qqzone.pojo.UserDetail;

public class UserDetailDaoImpl extends BaseDao<UserDetail> implements UserDetailDao {
    @Override
    public void addUserDetail(UserDetail userDetail) {
        String sql = "insert into t_user_detail (id, realName, tel, email, birth, star) values(?,?,?,?,?,?)";
        super.update(sql,userDetail.getId(),userDetail.getRealName(),userDetail.getTel(),userDetail.getEmail(),userDetail.getBirth(),userDetail.getStar());
    }

    @Override
    public UserDetail getUserDetail(Integer id) {
        String sql = "select * from t_user_detail where id=?";
        return super.getSingleBean(sql,UserDetail.class,id);
    }
}
