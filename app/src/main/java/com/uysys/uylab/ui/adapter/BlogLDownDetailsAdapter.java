package com.uysys.uylab.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.model.BlogDownDetailsModel;
import com.uysys.uylab.ui.model.BlogLabelModel;

import java.util.List;

public class BlogLDownDetailsAdapter extends RecyclerView.Adapter<BlogLDownDetailsAdapter.ViewHolder>{
    private Context context;
    private List dataset1;

    public BlogLDownDetailsAdapter(Context context, List dataset1) {
        this.context = context;
        this.dataset1 = dataset1;
    }

    @NonNull
    @Override
    public BlogLDownDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_bolg_details,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BlogLDownDetailsAdapter.ViewHolder holder, int position) {
        BlogDownDetailsModel blogLabelModel=(BlogDownDetailsModel) dataset1.get(position);
        holder.mainimage.setImageResource(blogLabelModel.getMainimage());
        holder.imagecircle.setImageResource(blogLabelModel.getClockimage());
        holder.icon.setImageResource(blogLabelModel.getLikeimage());

        holder.title.setText(blogLabelModel.getDesigntext());
        holder.shorttitle.setText(blogLabelModel.getTitletext());
        holder.time.setText(blogLabelModel.getTimetext());
        holder.like.setText(blogLabelModel.getLiketext());

    }

    @Override
    public int getItemCount() {
        return dataset1.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mainimage,imagecircle,icon;
        TextView title,shorttitle,time,like;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mainimage=itemView.findViewById(R.id.detailimage1);
            imagecircle=itemView.findViewById(R.id.clock);
            icon=itemView.findViewById(R.id.like);
            title=itemView.findViewById(R.id.design);
            shorttitle=itemView.findViewById(R.id.design_text);
            time=itemView.findViewById(R.id.timetxt);
            like=itemView.findViewById(R.id.liketext);

        }
    }
}
