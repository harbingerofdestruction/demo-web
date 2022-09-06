package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;

    private long id;

    private String creationDate;

    public Post(long id, String text) {
        this.id = id;
        this.text = text;
        this.creationDate = new Date().toString();
        this.likes = new Integer(0);
    }

    public long getId() {
        return id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }

    public String getCreationDate() { return creationDate; }
}
