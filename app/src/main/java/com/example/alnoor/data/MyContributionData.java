package com.example.alnoor.data;

import com.example.alnoor.models.MyContribution;

import java.util.ArrayList;
import java.util.List;

public class MyContributionData {

    private List<MyContribution> myContributionList = new ArrayList<>();

    public List<MyContribution> loadMyContributionList() {
        myContributionList.add(new MyContribution(
                1,
                "$200 Contribution",
                "Loren ipsum dolor sit amet, consectetur",
                "24-03-2000",
                "Thing"));

        return myContributionList;
    }
}
