package com.aresix.tagplanet.entity;

import java.util.List;

public class Task {
    private int task_id;
    private String image_url;
    private String sender_name;
    private List<Reply> mReplyList;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public List<Reply> getReplyList() {
        return mReplyList;
    }

    public void setReplyList(List<Reply> replyList) {
        mReplyList = replyList;
    }
}
