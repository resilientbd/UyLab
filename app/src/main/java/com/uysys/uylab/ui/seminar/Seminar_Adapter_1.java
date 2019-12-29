package com.uysys.uylab.ui.seminar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Seminar_Adapter_1 extends RecyclerView.Adapter<Seminar_Adapter_1.ViewHolder> {

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_seminar_recycler,null);
        ViewHolder viewHolder = new  ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
