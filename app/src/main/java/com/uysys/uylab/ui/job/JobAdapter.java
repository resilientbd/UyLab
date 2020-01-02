package com.uysys.uylab.ui.job;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;

public class JobAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    private JobAdapterClickListener jobAdapterClickListener;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_recycleviewjob,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jobAdapterClickListener.JobItemClick(position);
            }
        });
    }
    public void setJobAdapterClickListener(JobAdapterClickListener jobAdapterClickListener) {
        this.jobAdapterClickListener =jobAdapterClickListener;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
    public interface JobAdapterClickListener {
        public void JobItemClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private ConstraintLayout constraintLayout;
        private TextView textView5;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private TextView textView4;
        private View cons;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            constraintLayout=itemView.findViewById(R.id.constraintLayout);
            textView1=itemView.findViewById(R.id.text1);
            textView2=itemView.findViewById(R.id.text2);
            textView3=itemView.findViewById(R.id.text3);
            textView4=itemView.findViewById(R.id.text4);
            textView5=itemView.findViewById(R.id.text5);
            cons=itemView.findViewById(R.id.jobView);

        }
    }

}
