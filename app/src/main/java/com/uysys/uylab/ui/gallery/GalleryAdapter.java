package com.uysys.uylab.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.uysys.util.remote.model.gallery.Datum;
import com.uysys.util.remote.model.gallery.Photo;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemGalleryBinding;
import com.uysys.uylab.databinding.ItemGalleryHeaderBinding;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder>{
    ItemGalleryBinding mItemBinding;
    List<Photo> dataList;

    public GalleryAdapter() {
    }

    public GalleryAdapter(List<Photo> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        mItemBinding= DataBindingUtil.inflate(inflater,R.layout.item_gallery,parent,false);
        View view=mItemBinding.getRoot();
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(mItemBinding.getRoot().getContext()).load(dataList.get(position).getThumbnailUrl()).into(mItemBinding.imageViewPro20);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

    }
}
