package com.hss.javaweb.qqzone.pojo;

import java.time.LocalDateTime;

public class UserDetail {
    private int id;
    private String realName;
    private String tel;
    private String email;
    private LocalDateTime birth;
    private String star;

    public UserDetail() {
    }

    public UserDetail(int id, String realName, String tel, String email, LocalDateTime birth, String star) {
        this.id = id;
        this.realName = realName;
        this.tel = tel;
        this.email = email;
        this.birth = birth;
        this.star = star;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
}
