package com.example.alnoor;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.adapters.NotificationAdapter;
import com.example.alnoor.data.NotificationData;
import com.example.alnoor.models.Notification;

import java.util.List;

public class NotificationsActivity extends AppCompatActivity {

    private RecyclerView rvNotifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        initViews();

        NotificationData data = new NotificationData();
        List<Notification> myNotifications = data.loadItems();
        rvNotifications.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        NotificationAdapter adapter = new NotificationAdapter(this, myNotifications);
        rvNotifications.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initViews() {
        rvNotifications = (RecyclerView) findViewById(R.id.rvNotifications);
    }

    public void backNotifications(View view) {
        onBackPressed();
    }
}