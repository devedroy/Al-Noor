package com.example.alnoor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MyActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_activities);
    }

    public void backMyActivities(View view) {
        onBackPressed();
    }

    public void myContributions(View view) {
        startActivity(new Intent(this, MyContributionActivity.class));
    }

    public void Volunteered(View view) {
        startActivity(new Intent(this, VolunteeredActivity.class));
    }
}