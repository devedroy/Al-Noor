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
import com.example.alnoor.models.Notification;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotificationHolder> {
    private Context context;
    private List<Notification> notifications;

    public NotificationAdapter(Context context, List<Notification> notifications) {
        this.context = context;
        this.notifications = notifications;
    }

    @NonNull
    @Override
    public NotificationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notification_layout, parent, false);
        return new NotificationAdapter.NotificationHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationHolder holder, int position) {
        holder.tvSubject.setText(notifications.get(position).getSubject());
        holder.tvDescription.setText(notifications.get(position).getDescription());
        holder.tvNotificationTime.setText(notifications.get(position).getTime());

        holder.ivClock.setImageResource(notifications.get(position).getClockResourceId());
        holder.ivLogo.setImageResource(notifications.get(position).getLogoResourceId());

        final boolean[] clickFlag = {true};

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickFlag[0]) {
                    holder.tvDescription.setMaxLines(50);
                    clickFlag[0] = false;
                } else {
                    holder.tvDescription.setMaxLines(1);
                    clickFlag[0] = true;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }

    public class NotificationHolder extends RecyclerView.ViewHolder {

        TextView tvSubject, tvDescription, tvNotificationTime;
        ImageView ivLogo, ivClock;

        public NotificationHolder(@NonNull View itemView) {
            super(itemView);

            tvSubject = itemView.findViewById(R.id.tvSubject);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvNotificationTime = itemView.findViewById(R.id.tvNotificationTime);

            ivLogo = itemView.findViewById(R.id.ivLogo);
            ivClock = itemView.findViewById(R.id.ivClock);
        }
    }
}
