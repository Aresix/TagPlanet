package com.aresix.tagplanet.entity;

import java.util.List;

public class Image {
    private int image_id;
    private List<Tag> mTagList;
    private List<Integer> rsc_tag_id;

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public List<Tag> getTagList() {
        return mTagList;
    }

    public void setTagList(List<Tag> tagList) {
        mTagList = tagList;
    }

    public List<Integer> getRsc_tag_id() {
        return rsc_tag_id;
    }

    public void setRsc_tag_id(List<Integer> rsc_tag_id) {
        this.rsc_tag_id = rsc_tag_id;
    }
}
