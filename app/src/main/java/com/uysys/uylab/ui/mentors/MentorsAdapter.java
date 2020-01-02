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

    private MentorsAdapterClickListener mentorsAdapterClickListener;
    @NonNull
    @Override
    public OfficialPartnerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.mentors_recyler,parent,false);
        OfficialPartnerAdapter.ViewHolder holder = new OfficialPartnerAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull OfficialPartnerAdapter.ViewHolder holder, final int position) {
//        holder.constraintLayout.setConstraintSet(p);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mentorsAdapterClickListener.onMentorsItemClick(position);
            }
        });
    }

    public void setMentorsAdapterClickListener(MentorsAdapterClickListener mentorsAdapterClickListener) {
        this.mentorsAdapterClickListener = mentorsAdapterClickListener;
    }

    @Override
    public int getItemCount() {
        return 9;
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

    public interface MentorsAdapterClickListener{
        public void onMentorsItemClick(int position);
    }

}
