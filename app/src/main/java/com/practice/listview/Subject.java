package com.practice.listview;

public class Subject {
    private String name;
    private String desc;
    private int picture;

    public Subject() {
    }

    public Subject(String name, String desc, int picture) {
        this.name = name;
        this.desc = desc;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPicture() {
        return picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
