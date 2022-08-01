package com.example.alnoor.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.R;
import com.example.alnoor.model.MainActivityItem;

import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.MyActivityViewHolder> {

    private Context context;
    private List<MainActivityItem> dataset;



    public MainActivityAdapter(Context context, List<MainActivityItem> dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public MyActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_activity_item, parent, false);
        return new MyActivityViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull MyActivityViewHolder holder, int position) {
        MainActivityItem item = dataset.get(position);
        holder.tvItemName.setText(item.getItemName());
        holder.ivItemImage.setImageResource(item.getItemImageResource());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class MyActivityViewHolder extends RecyclerView.ViewHolder {
        ImageView ivItemImage;
        TextView tvItemName;

        public MyActivityViewHolder(@NonNull View itemView) {
            super(itemView);

            ivItemImage = itemView.findViewById(R.id.ivIcon);
            tvItemName = itemView.findViewById(R.id.tvName);

        }
    }
}
