package com.example.test;

public class User {
    private String name;
    private String description;
    private int id;
    private boolean followed;

    public User(String n, String d, int i, boolean f) {
        name = n;
        description = d;
        id = i;
        followed = f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}

