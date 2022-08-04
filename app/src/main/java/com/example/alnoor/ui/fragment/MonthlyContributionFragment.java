package com.example.alnoor.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.alnoor.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MonthlyContributionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonthlyContributionFragment extends Fragment {

    private TextView t1, t2, t3, t4;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MonthlyContributionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MonthlyContributionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MonthlyContributionFragment newInstance(String param1, String param2) {
        MonthlyContributionFragment fragment = new MonthlyContributionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monthly_contribution, container, false);

        initViews(view);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t1.setBackgroundResource(R.drawable.rect_rounded_black);
                t1.setTextColor(Color.WHITE);

                t2.setBackgroundResource(0);
                t3.setBackgroundResource(0);
                t4.setBackgroundResource(0);

                t2.setTextColor(Color.BLACK);
                t3.setTextColor(Color.BLACK);
                t4.setTextColor(Color.BLACK);

            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t2.setBackgroundResource(R.drawable.rect_rounded_black);
                t2.setTextColor(Color.WHITE);

                t1.setBackgroundResource(0);
                t3.setBackgroundResource(0);
                t4.setBackgroundResource(0);

                t1.setTextColor(Color.BLACK);
                t3.setTextColor(Color.BLACK);
                t4.setTextColor(Color.BLACK);

            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t3.setBackgroundResource(R.drawable.rect_rounded_black);
                t3.setTextColor(Color.WHITE);

                t2.setBackgroundResource(0);
                t1.setBackgroundResource(0);
                t4.setBackgroundResource(0);

                t2.setTextColor(Color.BLACK);
                t1.setTextColor(Color.BLACK);
                t4.setTextColor(Color.BLACK);

            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t4.setBackgroundResource(R.drawable.rect_rounded_black);
                t4.setTextColor(Color.WHITE);

                t2.setBackgroundResource(0);
                t3.setBackgroundResource(0);
                t1.setBackgroundResource(0);

                t2.setTextColor(Color.BLACK);
                t3.setTextColor(Color.BLACK);
                t1.setTextColor(Color.BLACK);

            }
        });

        return view;
    }

    private void initViews(View view) {
        t1 = view.findViewById(R.id.t1);
        t2 = view.findViewById(R.id.t2);
        t3 = view.findViewById(R.id.t3);
        t4 = view.findViewById(R.id.t4);
    }
}