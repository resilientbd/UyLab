package com.uysys.uylab.ui.success_story;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Success_Story2_Adapter extends RecyclerView.Adapter<Success_Story2_Adapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.success_story_recyler2,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
