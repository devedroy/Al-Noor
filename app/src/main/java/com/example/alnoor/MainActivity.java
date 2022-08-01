package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.adapter.MainActivityAdapter;
import com.example.alnoor.data.MyActivityItemData;
import com.example.alnoor.model.MainActivityItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView menu;
    DrawerLayout my_drawer_layout;
    LinearLayout ll_MyProfile, ll_ContactUs, ll_MyActs, ll_PrivacyPolicy, ll_Logout;
    RecyclerView rvTabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (my_drawer_layout.isDrawerOpen(Gravity.LEFT)) {
                    my_drawer_layout.closeDrawer(Gravity.LEFT);
                } else {
                    my_drawer_layout.openDrawer(Gravity.LEFT);
                }
            }
        });
        MyActivityItemData data = new MyActivityItemData();
        List<MainActivityItem> myDataSet = data.loadItems();
        MainActivityAdapter adapter = new MainActivityAdapter(this, myDataSet);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
        rvTabs.setLayoutManager(layoutManager);
        rvTabs.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initViews() {
        menu = findViewById(R.id.menu);
        my_drawer_layout = findViewById(R.id.my_drawer_layout);
        ll_MyProfile = findViewById(R.id.llMyProfile);
        ll_ContactUs = findViewById(R.id.llContactUs);
        ll_MyActs = findViewById(R.id.llMyActs);
        ll_PrivacyPolicy = findViewById(R.id.llPrivacyPolicy);
        ll_Logout = findViewById(R.id.llLogout);
        rvTabs = findViewById(R.id.rvTabs);
    }

    public void myProfile(View view) {
        ll_MyProfile.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    public void contactUs(View view) {
        ll_ContactUs.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, ContactUsActivity.class));
    }

    public void myActivities(View view) {
        ll_MyActs.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, MyActivities.class));
    }

    public void privacyPolicy(View view) {
        ll_PrivacyPolicy.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, PrivacyPolicyActivity.class));
    }

    public void logout(View view) {
        ll_Logout.setBackgroundResource(R.drawable.rect_red);
        finish();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }
}