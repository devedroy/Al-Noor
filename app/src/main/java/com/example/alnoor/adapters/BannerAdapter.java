package com.example.alnoor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.R;
import com.example.alnoor.models.Banner;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.BannerHolder> {

    private Context context;
    private List<Banner> bannerList;

    public BannerAdapter(Context context, List<Banner> bannerList) {
        this.context = context;
        this.bannerList = bannerList;
    }

    @NonNull
    @Override
    public BannerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.banner_layout, parent, false);

        return new BannerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerHolder holder, int position) {
        holder.ivBanner.setImageResource(bannerList.get(position).getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return bannerList.size();
    }

    public class BannerHolder extends RecyclerView.ViewHolder {
        ImageView ivBanner;

        public BannerHolder(@NonNull View itemView) {
            super(itemView);

            ivBanner = itemView.findViewById(R.id.ivBanner);
        }
    }
}
