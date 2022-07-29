package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    ImageView menu;
    DrawerLayout my_drawer_layout;
    LinearLayout ll_MyProfile, ll_ContactUs, ll_MyActs, ll_PrivacyPolicy;

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

    }

    private void initViews() {
        menu = findViewById(R.id.menu);
        my_drawer_layout = findViewById(R.id.my_drawer_layout);
        ll_MyProfile = findViewById(R.id.llMyProfile);
        ll_ContactUs = findViewById(R.id.llContactUs);
        ll_MyActs = findViewById(R.id.llMyActs);
        ll_PrivacyPolicy = findViewById(R.id.llPrivacyPolicy);

    }

    public void myProfile(View view) {
        ll_MyProfile.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    public void contactUs(View view) {
        ll_ContactUs.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, ContactUsFragment.class));
    }

    public void myActivities(View view) {
        ll_MyActs.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, MyActivities.class));
    }

    public void privacyPolicy(View view) {
        ll_PrivacyPolicy.setBackgroundResource(R.drawable.rect_red);
        startActivity(new Intent(MainActivity.this, PrivicyPolicyFragment.class));
    }
}