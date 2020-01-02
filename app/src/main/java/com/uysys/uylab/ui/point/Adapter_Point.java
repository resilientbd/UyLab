package com.uysys.uylab.ui.point;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;

import java.util.List;

public class Adapter_Point extends RecyclerView.Adapter<Adapter_Point.ViewHolder> {
    List<String> datalist;

    public Adapter_Point(List<String> datalist) {
        this.datalist = datalist;
    }

    public Adapter_Point() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recycler_points,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView) {


            super(itemView);
            constraintLayout =itemView.findViewById(R.id.item_recycler_points_layout);
        }
    }
}
