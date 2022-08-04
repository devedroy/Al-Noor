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
import com.example.alnoor.models.Volunteered;

import java.util.List;

public class VolunteeredAdapter extends RecyclerView.Adapter<VolunteeredAdapter.VolunteeredHolder> {
    private Context context;
    private List<Volunteered> volunteeredList;

    public VolunteeredAdapter(Context context, List<Volunteered> volunteeredList) {
        this.context = context;
        this.volunteeredList = volunteeredList;
    }

    @NonNull
    @Override
    public VolunteeredHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contributed_volunteered_layout, parent, false);
        return new VolunteeredHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VolunteeredHolder holder, int position) {
        holder.ivClock.setImageResource(R.drawable.outline_alarm_24);

        holder.tvIndex.setText(String.valueOf(volunteeredList.get(position).getIndex()));
        holder.tvTitle.setText(volunteeredList.get(position).getSubject());
        holder.tvBody.setText(volunteeredList.get(position).getBody());
        holder.tvDate.setText(volunteeredList.get(position).getDate());
        holder.tvTime.setText(volunteeredList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return volunteeredList.size();
    }

    public class VolunteeredHolder extends RecyclerView.ViewHolder {

        TextView tvIndex, tvTitle, tvBody, tvDate, tvTime;
        ImageView ivClock;

        public VolunteeredHolder(@NonNull View itemView) {
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
