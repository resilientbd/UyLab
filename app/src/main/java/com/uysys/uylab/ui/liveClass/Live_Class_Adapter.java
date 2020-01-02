package com.uysys.uylab.ui.liveClass;

;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Live_Class_Adapter extends RecyclerView.Adapter<Live_Class_Adapter.ViewHolder> {

    private Live_Class_AdapterClickListener live_class_adapterClickListener;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.live_cass_videoshower_recyler,parent,false);
        Live_Class_Adapter.ViewHolder holder = new Live_Class_Adapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                live_class_adapterClickListener.onLive_classItemClick(position);
            }
        });
    }
    public void setLive_class_adapterClickListener(Live_Class_AdapterClickListener live_class_adapterClickListener) {
        this.live_class_adapterClickListener = live_class_adapterClickListener;
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public interface Live_Class_AdapterClickListener {
        public void onLive_classItemClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ConstraintLayout constraintLayout;

        public View cons;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
            cons =itemView.findViewById(R.id.videoView);

        }
    }
}
