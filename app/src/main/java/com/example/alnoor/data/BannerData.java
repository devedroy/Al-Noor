package com.example.alnoor.data;

import com.example.alnoor.R;
import com.example.alnoor.models.Banner;

import java.util.ArrayList;
import java.util.List;

public class BannerData {
    private List<Banner> bannerList = new ArrayList<>();

    public List<Banner> loadBannerList() {
        bannerList.add(new Banner(R.drawable.pass_photo));
        bannerList.add(new Banner(R.drawable.pass_photo));
        bannerList.add(new Banner(R.drawable.pass_photo));
        bannerList.add(new Banner(R.drawable.pass_photo));
        return bannerList;
    }

}
