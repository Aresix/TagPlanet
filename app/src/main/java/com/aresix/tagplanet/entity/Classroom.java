package com.aresix.tagplanet.entity;

import java.util.List;

public class Classroom {
    private int class_id;
    private String class_name;
    private List<User> mUserList;
    private List<Integer> rsc_tag_id;

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public List<User> getUserList() {
        return mUserList;
    }

    public void setUserList(List<User> userList) {
        mUserList = userList;
    }

    public List<Integer> getRsc_tag_id() {
        return rsc_tag_id;
    }

    public void setRsc_tag_id(List<Integer> rsc_tag_id) {
        this.rsc_tag_id = rsc_tag_id;
    }
}
