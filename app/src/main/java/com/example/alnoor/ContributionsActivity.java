package com.example.alnoor;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.alnoor.ui.fragment.MonthlyContributionFragment;
import com.example.alnoor.ui.fragment.OneTimeContributionFragment;

public class ContributionsActivity extends AppCompatActivity {

    private LinearLayout llOneTime, llMonthly;
    private TextView tvMonthly, tvOneTime;
    private ImageView ivMonthly, ivOneTime;

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
                tvOneTime.setTextColor(Color.RED);
                ivOneTime.setColorFilter(Color.RED);

                llMonthly.setBackgroundResource(0);
                tvMonthly.setTextColor(Color.BLACK);
                ivMonthly.setColorFilter(Color.BLACK);
                switchFragment(new OneTimeContributionFragment());
            }
        });
        llMonthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                llMonthly.setBackground(getDrawable(R.drawable.rect_rounded_red_stroke));
                tvMonthly.setTextColor(Color.RED);
                ivMonthly.setColorFilter(Color.RED);

                llOneTime.setBackgroundResource(0);
                tvOneTime.setTextColor(Color.BLACK);
                ivOneTime.setColorFilter(Color.BLACK);
                switchFragment(new MonthlyContributionFragment());
            }
        });
    }

    private void initViews() {
        llOneTime = (LinearLayout) findViewById(R.id.llOneTime);
        llMonthly = (LinearLayout) findViewById(R.id.llMonthly);
        tvMonthly = (TextView) findViewById(R.id.tvMonthly);
        tvOneTime = (TextView) findViewById(R.id.tvOneTime);
        ivOneTime = (ImageView) findViewById(R.id.ivOneTime);
        ivMonthly = (ImageView) findViewById(R.id.ivMonthly);

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