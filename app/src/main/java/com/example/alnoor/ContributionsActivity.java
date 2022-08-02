package com.example.alnoor;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ContributionsActivity extends AppCompatActivity {

    private LinearLayout llOneTime, llMonthly;
    private Fragment fragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contributions);

        initViews();

        llOneTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llOneTime.setBackground(getDrawable(R.drawable.rect_rounded_red_stroke));
                llMonthly.setBackgroundResource(0);
                switchFragment(new ContributeFragment());
            }
        });
        llMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llOneTime.setBackgroundResource(0);
                llMonthly.setBackground(getDrawable(R.drawable.rect_rounded_red_stroke));
                switchFragment(new ContributeFragment());
            }
        });
    }

    private void initViews() {
        llOneTime = (LinearLayout) findViewById(R.id.llOneTime);
        llMonthly = (LinearLayout) findViewById(R.id.llMonthly);
    }

    private void switchFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, fragment);
        fragmentTransaction.commit();


    }


    public void backContributions(View view) {
        onBackPressed();
    }
}