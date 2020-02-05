package com.aresix.tagplanet.entity;

import java.util.List;

public class Resource {
    private int rsc_tag_id;
    List<Item> item;

    public int getRsc_tag_id() {
        return rsc_tag_id;
    }

    public void setRsc_tag_id(int rsc_tag_id) {
        this.rsc_tag_id = rsc_tag_id;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
