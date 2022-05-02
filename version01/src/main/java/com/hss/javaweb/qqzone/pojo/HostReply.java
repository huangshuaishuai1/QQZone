package com.hss.javaweb.qqzone.pojo;


import java.time.LocalDateTime;

public class HostReply {

    private int id;
    private String content;
    private LocalDateTime hostReplyDate;
    private int author;
    private int reply;

    private UserBasic authorObj;
    public HostReply() {
    }

    public HostReply(int id, String content, LocalDateTime hostReplyDate, int author, int reply) {
        this.id = id;
        this.content = content;
        this.hostReplyDate = hostReplyDate;
        this.author = author;
        this.reply = reply;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getHostReplyDate() {
        return hostReplyDate;
    }

    public void setHostReplyDate(LocalDateTime hostReplyDate) {
        this.hostReplyDate = hostReplyDate;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getReply() {
        return reply;
    }

    public void setReply(int reply) {
        this.reply = reply;
    }

}
