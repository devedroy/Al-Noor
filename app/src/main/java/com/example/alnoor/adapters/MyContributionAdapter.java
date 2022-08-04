package com.example.alnoor.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alnoor.R;
import com.example.alnoor.models.MyContribution;

import java.util.List;

public class MyContributionAdapter extends RecyclerView.Adapter<MyContributionAdapter.MyContributionHolder> {

    private Context context;
    private List<MyContribution> myContributionList;

    public MyContributionAdapter(Context context, List<MyContribution> myContributionList) {
        this.context = context;
        this.myContributionList = myContributionList;
    }

    @NonNull
    @Override
    public MyContributionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contributed_volunteered_layout, parent, false);
        return new MyContributionAdapter.MyContributionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyContributionHolder holder, int position) {
        holder.ivClock.setImageResource(R.drawable.outline_alarm_24);

        holder.tvIndex.setText(String.valueOf(myContributionList.get(position).getIndex()));
        holder.tvTitle.setText(myContributionList.get(position).getSubject());
        holder.tvBody.setText(myContributionList.get(position).getBody());
        holder.tvDate.setText(myContributionList.get(position).getDate());
        holder.tvTime.setText(myContributionList.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return myContributionList.size();
    }

    public class MyContributionHolder extends RecyclerView.ViewHolder {
        TextView tvIndex, tvTitle, tvBody, tvDate, tvTime;
        ImageView ivClock;

        public MyContributionHolder(@NonNull View itemView) {
            super(itemView);
            tvIndex = itemView.findViewById(R.id.tvIndex);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvBody = itemView.findViewById(R.id.tvBody);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvTime = itemView.findViewById(R.id.tvTime);

            ivClock = itemView.findViewById(R.id.ivClock);
        }
    }
}
