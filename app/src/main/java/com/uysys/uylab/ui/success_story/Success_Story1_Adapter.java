package com.uysys.uylab.ui.success_story;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.seminar.Seminar_Adapter_2;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class Success_Story1_Adapter extends RecyclerView.Adapter<Success_Story1_Adapter.ViewHolder> {

   private Success_Story1_AdapterClickLisener success_story1_adapterClickLisener;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.item_success_story_details,null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                success_story1_adapterClickLisener.onSuccess_storyItemClick(position);
            }
        });
    }
    public void setSuccess_story1_adapterClickLisener(Success_Story1_Adapter.Success_Story1_AdapterClickLisener success_story1_adapterClickLisener) {
        this.success_story1_adapterClickLisener = success_story1_adapterClickLisener;
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public interface Success_Story1_AdapterClickLisener {
        public void onSuccess_storyItemClick(int position);

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ConstraintLayout cons;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cons = itemView.findViewById(R.id.viewSecend);
        }
    }
}
