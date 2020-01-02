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
import com.uysys.uylab.ui.model.BlogLabelModel;

import java.util.List;

public class BlogLableAdapter extends RecyclerView.Adapter<BlogLableAdapter.ViewHolder>{
    private Context context;
    private List dataset;

    public BlogLableAdapter(Context context, List dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public BlogLableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_blog_label,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BlogLableAdapter.ViewHolder holder, int position) {
        BlogLabelModel blogLabelModel=(BlogLabelModel) dataset.get(position);
        holder.mainimage.setImageResource(blogLabelModel.getMainimage());
        holder.imagecircle.setImageResource(blogLabelModel.getImagecircle());
        holder.icon.setImageResource(blogLabelModel.getIcon());

        holder.title.setText(blogLabelModel.getTitle());
        holder.shorttitle.setText(blogLabelModel.getShorttitle());
        holder.time.setText(blogLabelModel.getTime());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mainimage,imagecircle,icon;
        TextView title,shorttitle,time,name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mainimage=itemView.findViewById(R.id.sample1);
            imagecircle=itemView.findViewById(R.id.shortimage);
            icon=itemView.findViewById(R.id.icon);
            title=itemView.findViewById(R.id.texttitle);
            shorttitle=itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);

        }
    }
}
