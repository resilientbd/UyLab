package com.uysys.uylab.ui.tutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.uysys.uylab.R;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Tutorial_Popular_Adapter extends RecyclerView.Adapter<Tutorial_Popular_Adapter.ViewHolder> {
private Tutorial_Popular_AdapterClickLisiner tutorial_popular_adapterClickLisiner;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_tutorial_popular,parent,false);
        Tutorial_Popular_Adapter.ViewHolder holder = new Tutorial_Popular_Adapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutorial_popular_adapterClickLisiner.onLive_classItemClick(position);
            }
        });
    }
    public void setTutroial_Popular_adapterClickListener(Tutorial_Popular_AdapterClickLisiner tutroial_popular_adapterClickListener) {
        this.tutorial_popular_adapterClickLisiner = tutroial_popular_adapterClickListener;
    }
    @Override
    public int getItemCount() {
        return 3;
    }

    public interface Tutorial_Popular_AdapterClickLisiner {
        public void onLive_classItemClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public View cons;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            cons = itemView.findViewById(R.id.videoView);

        }
    }
}
