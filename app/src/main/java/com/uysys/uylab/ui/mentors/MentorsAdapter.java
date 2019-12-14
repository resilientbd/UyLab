package com.uysys.uylab.ui.mentors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.ourPartner.OfficialPartnerAdapter;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MentorsAdapter extends RecyclerView.Adapter<OfficialPartnerAdapter.ViewHolder> {


    @NonNull
    @Override
    public OfficialPartnerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.mentors_recyler,parent,false);
        OfficialPartnerAdapter.ViewHolder holder = new OfficialPartnerAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull OfficialPartnerAdapter.ViewHolder holder, int position) {
//        holder.constraintLayout.setConstraintSet(p);
    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);

        }
    }

}
