package com.example.alnoor;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MyContributionActivity extends AppCompatActivity {

    private RecyclerView rvMyContributions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contribution);

        initViews();
    }

    private void initViews() {
        rvMyContributions = findViewById(R.id.rvMyContributions);
    }


    public void backMyContributions(View view) {
        onBackPressed();
    }
}