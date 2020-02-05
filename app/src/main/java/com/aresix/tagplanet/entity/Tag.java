package com.aresix.tagplanet.entity;


/**
 * tag_url: 下载的图片链接
 * ques_type: 动物、植物、自定义
 */
public class Tag {
    private int tag_id;
    private String tag_url;
    private String ques_type;

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    public String getTag_url() {
        return tag_url;
    }

    public void setTag_url(String tag_url) {
        this.tag_url = tag_url;
    }

    public String getQues_type() {
        return ques_type;
    }

    public void setQues_type(String ques_type) {
        this.ques_type = ques_type;
    }
}
