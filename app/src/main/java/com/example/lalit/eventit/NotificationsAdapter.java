package com.example.lalit.eventit;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lalit.eventit.R;

/**
 * Created by Lalit on 24-Mar-18.
 */

public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.NotificationsViewHolder> {

    private String[] data;
    public NotificationsAdapter(String[] data){
        this.data = data;
    }

    @Override
    public NotificationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.fragment_frg_notification_item,parent,false);
        return new NotificationsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationsViewHolder holder, int position) {
        String item=data[position];
        holder.tvNotiItem.setText(item);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class NotificationsViewHolder extends RecyclerView.ViewHolder{
        ImageView ivNotiItem;
        TextView tvNotiItem;
        public NotificationsViewHolder(View itemView) {
            super(itemView);
            ivNotiItem=itemView.findViewById(R.id.ivNotiItem);
            tvNotiItem=itemView.findViewById(R.id.tvNotiITem);
        }
    }
}
