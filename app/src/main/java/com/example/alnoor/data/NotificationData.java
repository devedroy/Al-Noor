package com.example.alnoor.data;

import com.example.alnoor.R;
import com.example.alnoor.model.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationData {
    private List<Notification> notificationList = new ArrayList<>();

    public List<Notification> loadItems() {

        notificationList.add(new Notification(
                R.drawable.round_notifications_24,
                "Valuntter",
                "Loren ipsum dolor sit amet, consectetur",
                R.drawable.outline_alarm_24,
                "2:00 pm"));

        notificationList.add(new Notification(
                R.drawable.round_notifications_24,
                "Valuntter",
                "Loren ipsum dolor sit amet, consectetur",
                R.drawable.outline_alarm_24,
                "2:00 pm"));

        notificationList.add(new Notification(
                R.drawable.round_notifications_24,
                "Valuntter",
                "Loren ipsum dolor sit amet, consectetur",
                R.drawable.outline_alarm_24,
                "2:00 pm"));
        return notificationList;
    }
}
