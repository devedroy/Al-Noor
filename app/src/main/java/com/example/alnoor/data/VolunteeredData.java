package com.example.alnoor.data;

import com.example.alnoor.models.Volunteered;

import java.util.ArrayList;
import java.util.List;

public class VolunteeredData {

    private List<Volunteered> volunteeredList = new ArrayList<>();

    public List<Volunteered> loadVolunteeredList() {
        volunteeredList.add(new Volunteered(
                1,
                "Loren ipsum dolor",
                "Loren ipsum dolor sit amet, consectetur",
                "24-03-2000",
                "Monthly"));

        return volunteeredList;
    }
}
