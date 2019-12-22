package com.uysys.uylab.ui.tutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.uysys.uylab.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Tutorial_Recent_Adapter extends RecyclerView.Adapter<Tutorial_Recent_Adapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_tutorial_recent,parent,false);
        Tutorial_Recent_Adapter.ViewHolder holder = new Tutorial_Recent_Adapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public View cons;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            cons = itemView.findViewById(R.id.mentorsProfileView);

        }
    }
}
