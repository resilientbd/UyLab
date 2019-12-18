package com.uysys.uylab.ui.event;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.model.BlogLabelModel;

import java.util.List;

public class EventLableAdapter extends RecyclerView.Adapter<EventLableAdapter.ViewHolder>{
    private Context context;
    private List dataset;
    private EventLabelAdapterItemClickListener itemClickListener;
    public EventLableAdapter(Context context, List dataset) {
        this.context = context;
        this.dataset = dataset;
    }

    public void setItemClickListener(EventLabelAdapterItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public EventLableAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_event_label,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventLableAdapter.ViewHolder holder, final int position) {
//        BlogLabelModel blogLabelModel=(BlogLabelModel) dataset.get(position);
//        holder.mainimage.setImageResource(blogLabelModel.getMainimage());
//        holder.imagecircle.setImageResource(blogLabelModel.getImagecircle());
//        holder.icon.setImageResource(blogLabelModel.getIcon());
//
//        holder.title.setText(blogLabelModel.getTitle());
//        holder.shorttitle.setText(blogLabelModel.getShorttitle());
//        holder.time.setText(blogLabelModel.getTime());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(itemClickListener!=null)
                {
                    itemClickListener.onItemClick(position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView mainimage,imagecircle,icon;
        TextView title,shorttitle,time,name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mainimage=itemView.findViewById(R.id.sample1);
            imagecircle=itemView.findViewById(R.id.shortimage);
            icon=itemView.findViewById(R.id.icon);
            title=itemView.findViewById(R.id.texttitle);
            shorttitle=itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);
            cardView=itemView.findViewById(R.id.cardView);

        }
    }
    public interface EventLabelAdapterItemClickListener{
        public void onItemClick(int position);
    }
}
