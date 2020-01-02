package com.uysys.uylab.ui.liveClass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Live_Video_Adapter extends RecyclerView.Adapter<Live_Video_Adapter.ViewHolder> {

    private Live_Video_AdapterClickListener live_video_adapterClickListener;
    @NonNull
    @Override
    public Live_Video_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.live_cass_videoshower_recyler,parent,false);
        Live_Video_Adapter.ViewHolder holder = new Live_Video_Adapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Live_Video_Adapter.ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                live_video_adapterClickListener.onLive_VideoItemClick(position);
            }
        });
    }
    public void setLive_video_adapterClickListener(Live_Video_AdapterClickListener live_video_adapterClickListener) {
        this.live_video_adapterClickListener = live_video_adapterClickListener;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
    public interface Live_Video_AdapterClickListener {
        public void onLive_VideoItemClick(int position);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ConstraintLayout constraintLayout;
        public View cons;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
            cons = itemView.findViewById(R.id.videoView);
        }
    }
}
