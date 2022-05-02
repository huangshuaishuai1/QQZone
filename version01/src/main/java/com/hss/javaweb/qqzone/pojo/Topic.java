package com.hss.javaweb.qqzone.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class Topic {
    private int id;
    private String title;
    private String content;
    private LocalDateTime topicDate;
    private int author;
    private List<Reply> replyList;

    private UserBasic authorObj;
    public Topic() {
    }

    public Topic(int id, String title, String content, LocalDateTime topicDate, int author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.topicDate = topicDate;
        this.author = author;
    }

    public UserBasic getAuthorObj() {
        return authorObj;
    }

    public void setAuthorObj(UserBasic authorObj) {
        this.authorObj = authorObj;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTopicDate() {
        return topicDate;
    }

    public void setTopicDate(LocalDateTime topicDate) {
        this.topicDate = topicDate;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public List<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<Reply> replyList) {
        this.replyList = replyList;
    }

    public Topic(int id) {
        this.id = id;
    }
}

