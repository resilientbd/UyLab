package com.uysys.uylab.ui.gallery;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.squareup.picasso.Picasso;
import com.uysys.util.remote.model.gallery.Datum;
import com.uysys.util.remote.model.gallery.Photo;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemGalleryBinding;
import com.uysys.uylab.databinding.ItemGalleryHeaderBinding;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;

import java.util.List;

public class GalleryAdapter extends BaseAdapter<Photo> {

    public GalleryAdapter() {
    }

    @Override
    public boolean isEqual(Photo left, Photo right) {
        return false;
    }

    @Override
    public BaseViewHolder<Photo> newViewHolder(ViewGroup parent, int viewType) {
        return new GalleryAdapterViewHolder(inflate(parent,R.layout.item_gallery));
    }



    private class GalleryAdapterViewHolder extends BaseAdapterViewHolder<Photo>{
    private ItemGalleryBinding mItemBinding;

        public GalleryAdapterViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            mItemBinding=(ItemGalleryBinding) viewDataBinding;
        }


        @Override
        public void bind(Photo item) {

            Picasso.with(mItemBinding.getRoot().getContext()).load("https://placehold.it/640x480").error(R.drawable.default_img).into(mItemBinding.imageViewPro20);


        }
    }
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
//        mItemBinding= DataBindingUtil.inflate(inflater,R.layout.item_gallery,parent,false);
//        View view=mItemBinding.getRoot();
//        ViewHolder viewHolder=new ViewHolder(view);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Log.d("chkgallery","url:"+dataList.get(position).getThumbnailUrl());
//        Glide.with(mItemBinding.getRoot().getContext()).load(dataList.get(position).getThumbnailUrl()).into(mItemBinding.imageViewPro20);
//    }

//    @Override
//    public int getItemCount() {
//        return dataList.size();
//    }
//
//    static class ViewHolder extends RecyclerView.ViewHolder{
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//        }
//
//    }
}
