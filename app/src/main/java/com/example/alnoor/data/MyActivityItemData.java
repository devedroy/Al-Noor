package com.example.alnoor.data;

import com.example.alnoor.R;
import com.example.alnoor.model.MainActivityItem;

import java.util.ArrayList;
import java.util.List;

public class MyActivityItemData {
    private List<MainActivityItem> itemList = new ArrayList<>();

    public List<MainActivityItem> loadItems() {
        itemList.add(new MainActivityItem(R.drawable.baseline_shopping_bag_24, "Contributions"));
        itemList.add(new MainActivityItem(R.drawable.twotone_emoji_people_24, "Volunteer"));
        itemList.add(new MainActivityItem(R.drawable.round_notifications_24, "Notifications"));
        itemList.add(new MainActivityItem(R.drawable.round_handshake_24, "Partner with us"));
        itemList.add(new MainActivityItem(R.drawable.baseline_chat_24, "Request to Donate"));
        itemList.add(new MainActivityItem(R.drawable.baseline_auto_stories_24, "Stories"));
        itemList.add(new MainActivityItem(R.drawable.round_grid_view_24, "Requirements"));
        itemList.add(new MainActivityItem(R.drawable.round_volunteer_activism_24, "App Info"));
        return itemList;
    }
}
