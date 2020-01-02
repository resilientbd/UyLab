package com.uysys.uylab.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.model.gallery.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemGalleryHeaderBinding;
import com.uysys.uylab.databinding.ItemGalleryHeaderBindingImpl;

import java.util.List;

public class GalleryHeaderAdapter extends  RecyclerView.Adapter<GalleryHeaderAdapter.ViewHolder>{
    ItemGalleryHeaderBindingImpl mItemBinding;

    public GalleryHeaderAdapter(List<Datu> dataList) {
        this.dataList = dataList;
    }

    private List<Datum> dataList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        mItemBinding= DataBindingUtil.inflate(inflater, R.layout.item_gallery_header,parent,false);
        View view=mItemBinding.getRoot();
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            mItemBinding.btnItemGallery.setText(dataList.get(position).getTitle());
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
