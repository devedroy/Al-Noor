package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import com.example.alnoor.adapters.BannerAdapter;
import com.example.alnoor.data.BannerData;

public class MainActivity extends AppCompatActivity {

    ImageView menu;
    DrawerLayout my_drawer_layout;
    LinearLayout ll_MyProfile, ll_ContactUs, ll_MyActs, ll_PrivacyPolicy, ll_Logout;

    ViewPager2 vpBanners;

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

        BannerData data = new BannerData();
        BannerAdapter adapter = new BannerAdapter(this, data.loadBannerList());
        vpBanners.setAdapter(adapter);
    }

    private void initViews() {
        menu = findViewById(R.id.menu);
        my_drawer_layout = findViewById(R.id.my_drawer_layout);
        ll_MyProfile = findViewById(R.id.llMyProfile);
        ll_ContactUs = findViewById(R.id.llContactUs);
        ll_MyActs = findViewById(R.id.llMyActs);
        ll_PrivacyPolicy = findViewById(R.id.llPrivacyPolicy);
        ll_Logout = findViewById(R.id.llLogout);
        vpBanners = findViewById(R.id.vpBanners);
    }

    public void myProfile(View view) {
        ll_MyProfile.setBackgroundResource(R.drawable.rect_red);

        ll_ContactUs.setBackgroundResource(0);
        ll_MyActs.setBackgroundResource(0);
        ll_PrivacyPolicy.setBackgroundResource(0);
        ll_Logout.setBackgroundResource(0);

        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    public void contactUs(View view) {
        ll_ContactUs.setBackgroundResource(R.drawable.rect_red);

        ll_MyActs.setBackgroundResource(0);
        ll_PrivacyPolicy.setBackgroundResource(0);
        ll_Logout.setBackgroundResource(0);
        ll_MyProfile.setBackgroundResource(0);

        startActivity(new Intent(MainActivity.this, ContactUsActivity.class));

    }

    public void myActivities(View view) {
        ll_MyActs.setBackgroundResource(R.drawable.rect_red);

        ll_PrivacyPolicy.setBackgroundResource(0);
        ll_Logout.setBackgroundResource(0);
        ll_MyProfile.setBackgroundResource(0);
        ll_ContactUs.setBackgroundResource(0);

        startActivity(new Intent(MainActivity.this, MyActivities.class));
    }

    public void privacyPolicy(View view) {
        ll_PrivacyPolicy.setBackgroundResource(R.drawable.rect_red);

        ll_Logout.setBackgroundResource(0);
        ll_MyProfile.setBackgroundResource(0);
        ll_ContactUs.setBackgroundResource(0);
        ll_MyActs.setBackgroundResource(0);

        startActivity(new Intent(MainActivity.this, PrivacyPolicyActivity.class));
    }

    public void logout(View view) {
        ll_Logout.setBackgroundResource(R.drawable.rect_red);

        ll_MyProfile.setBackgroundResource(0);
        ll_ContactUs.setBackgroundResource(0);
        ll_MyActs.setBackgroundResource(0);
        ll_PrivacyPolicy.setBackgroundResource(0);

        finish();
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void contributions(View view) {
        startActivity(new Intent(this, ContributionsActivity.class));
    }

    public void beAVolunteer(View view) {
        startActivity(new Intent(this, VolunteerActivity.class));
    }

    public void notifications(View view) {
        startActivity(new Intent(this, NotificationsActivity.class));
    }

    public void partnerWithUs(View view) {
        startActivity(new Intent(this, VolunteersActivity.class));
    }

    public void requestToDonate(View view) {
        startActivity(new Intent(this, DonationActivity.class));
    }

    public void stories(View view) {
        startActivity(new Intent(this, StoriesActivity.class));
    }

    public void requirements(View view) {
        startActivity(new Intent(this, RequirementDetailActivity.class));
    }

    public void appInfo(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }
}