package com.uysys.uylab.ui.classContent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;

public class ClassContentAdapter  extends RecyclerView.Adapter<ClassContentAdapter.ViewHolder>{
    private OnClassAdapterItemClickListener listener;

    public void setListener(OnClassAdapterItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.class_content_shower_recyler,null);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener!=null)
                {
                    listener.onClassAdapterItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    static  class ViewHolder extends RecyclerView.ViewHolder{
    private View view;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView.findViewById(R.id.layout);
        }
    }
    public interface OnClassAdapterItemClickListener{
        public void onClassAdapterItemClick(int position);
    }
}
