package com.hss.javaweb.qqzone.pojo;
import java.time.LocalDateTime;

public class Reply {
    private int id;
    private String content;
    private LocalDateTime replyDate;
    private int author;
    private int topic;

    private HostReply hostReply;

    public Reply() {
    }

    public Reply(int id, String content, LocalDateTime replyDate, int author, int topic) {
        this.id = id;
        this.content = content;
        this.replyDate = replyDate;
        this.author = author;
        this.topic = topic;
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

    public LocalDateTime getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(LocalDateTime replyDate) {
        this.replyDate = replyDate;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getTopic() {
        return topic;
    }

    public void setTopic(int topic) {
        this.topic = topic;
    }

    public HostReply getHostReply() {
        return hostReply;
    }

    public void setHostReply(HostReply hostReply) {
        this.hostReply = hostReply;
    }

    public Reply(int id) {
        this.id = id;
    }
}
