package com.example.alnoor.data;

import com.example.alnoor.models.MyContribution;

import java.util.ArrayList;
import java.util.List;

public class MyContributionData {

    private List<MyContribution> myContributionList = new ArrayList<>();

    public List<MyContribution> loadVolunteeredList() {
        myContributionList.add(new MyContribution(
                1,
                "Loren ipsum dolor",
                "Loren ipsum dolor sit amet, consectetur",
                "24-03-2000",
                "Monthly"));

        return myContributionList;
    }
}
