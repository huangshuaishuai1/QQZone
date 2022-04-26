package com.hss.javaweb.qqzone.pojo;

import java.util.List;

public class UserBasic {
    private int id;

    private String loginId;
    private String nickName;
    private String pwd;
    private String headImg;

    private UserDetail userDetail;  // 1:1
    private List<Topic> topicList;
    private List<UserBasic> friendsList;


    public UserBasic() {
    }

    public UserBasic(int id, String loginId, String nickName, String pwd, String headImg) {
        this.id = id;
        this.loginId = loginId;
        this.nickName = nickName;
        this.pwd = pwd;
        this.headImg = headImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public List<UserBasic> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<UserBasic> friendsList) {
        this.friendsList = friendsList;
    }

    public UserBasic(int id) {
        this.id = id;
    }
}
