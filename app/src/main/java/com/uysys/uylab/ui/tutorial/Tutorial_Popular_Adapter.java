package com.uysys.uylab.ui.tutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.uysys.util.remote.model.tutorial.Popular;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemTutorialPopularBinding;


import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Tutorial_Popular_Adapter extends RecyclerView.Adapter<Tutorial_Popular_Adapter.ViewHolder> {
List<Popular> popularlist;
private ItemTutorialPopularBinding mItemBinding;

    public Tutorial_Popular_Adapter(List<Popular> popularlist) {
        this.popularlist = popularlist;
    }

    private Tutorial_Popular_AdapterClickLisiner tutorial_popular_adapterClickLisiner;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        mItemBinding= DataBindingUtil.inflate(inflater,R.layout.item_tutorial_popular,parent,false);
        View view = mItemBinding.getRoot();
        Tutorial_Popular_Adapter.ViewHolder holder = new Tutorial_Popular_Adapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mItemBinding.getRoot().getContext()).load(popularlist.get(position).getVideoThumbnail()).into( mItemBinding.sample1);
        mItemBinding.textView96.setText(""+popularlist.get(position).getVideoTitle());
        mItemBinding.textView97.setText(""+popularlist.get(position).getVideoSubtitle());
        mItemBinding.textView98.setText(""+popularlist.get(position).getRuntime());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutorial_popular_adapterClickLisiner.onLive_classItemClick(position);
            }
        });
    }
    public void setTutroial_Popular_adapterClickListener(Tutorial_Popular_AdapterClickLisiner tutroial_popular_adapterClickListener) {
        this.tutorial_popular_adapterClickLisiner = tutroial_popular_adapterClickListener;
    }
    @Override
    public int getItemCount() {
        return popularlist.size();
    }

    public interface Tutorial_Popular_AdapterClickLisiner {
        public void onLive_classItemClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public View cons;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            cons = itemView.findViewById(R.id.videoView);

        }
    }
}
