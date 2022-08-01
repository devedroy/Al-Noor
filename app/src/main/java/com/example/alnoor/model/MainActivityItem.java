package com.example.alnoor.model;

import android.graphics.drawable.Drawable;

public class MainActivityItem {
    int itemImageResource;
    String itemName;

    public MainActivityItem(int itemImageResource, String itemName) {
        this.itemImageResource = itemImageResource;
        this.itemName = itemName;
    }

    public int getItemImageResource() {
        return itemImageResource;
    }

    public void setItemImageResource(int itemImageResource) {
        this.itemImageResource = itemImageResource;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
