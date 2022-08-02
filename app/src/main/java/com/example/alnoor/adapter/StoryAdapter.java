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
import com.example.alnoor.model.Story;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryHolder> {

    private Context context;
    private List<Story> stories;

    public StoryAdapter(Context context, List<Story> stories) {
        this.context = context;
        this.stories = stories;
    }

    @NonNull
    @Override
    public StoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.story_layout, parent, false);
        return new StoryAdapter.StoryHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryHolder holder, int position) {
        holder.tvStoryTime.setText(stories.get(position).getTime());
        holder.tvSubject.setText(stories.get(position).getSubject());
        holder.tvDescription.setText(stories.get(position).getDescription());
        holder.tvStoryNumber.setText(String.valueOf(stories.get(position).getStoryNumber()));

        holder.ivClock.setImageResource(stories.get(position).getClockResourceId());

    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class StoryHolder extends RecyclerView.ViewHolder {

        TextView tvStoryNumber, tvSubject, tvDescription, tvStoryTime;
        ImageView ivClock;

        public StoryHolder(@NonNull View itemView) {
            super(itemView);

            tvSubject = itemView.findViewById(R.id.tvStorySubject);
            tvStoryNumber = itemView.findViewById(R.id.tvStoryNumber);
            tvDescription = itemView.findViewById(R.id.tvStoryDescription);
            tvStoryTime = itemView.findViewById(R.id.tvStoryTime);

            ivClock = itemView.findViewById(R.id.ivStoryClock);
        }
    }
}
