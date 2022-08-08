package com.example.alnoor.data;

import com.example.alnoor.R;
import com.example.alnoor.models.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerData {
    private List<Banner> bannerList = new ArrayList<>();

    public List<Banner> loadBannerList() {
        bannerList.add(new Banner(R.drawable.education_banner));
        bannerList.add(new Banner(R.drawable.education_banner));
        bannerList.add(new Banner(R.drawable.education_banner));
        bannerList.add(new Banner(R.drawable.education_banner));
        return bannerList;
    }

}
