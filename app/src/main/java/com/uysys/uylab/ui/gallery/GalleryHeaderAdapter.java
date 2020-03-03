package com.uysys.uylab.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.model.gallery.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemGalleryHeaderBinding;
import com.uysys.uylab.databinding.ItemGalleryHeaderBindingImpl;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;

import java.util.List;

public class GalleryHeaderAdapter extends BaseAdapter<Datum> {


    @Override
    public boolean isEqual(Datum left, Datum right) {
        return false;
    }

    @Override
    public BaseViewHolder<Datum> newViewHolder(ViewGroup parent, int viewType) {
        return new GalleryHeaderAdapterViewHolder(inflate(parent, R.layout.item_gallery_header));
    }

    private class GalleryHeaderAdapterViewHolder extends BaseAdapterViewHolder<Datum> {
        ItemGalleryHeaderBinding mItemBinding;

        public GalleryHeaderAdapterViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            mItemBinding = (ItemGalleryHeaderBinding) viewDataBinding;
        }

        @Override
        public void bind(Datum item) {
            mItemBinding.btnItemGallery.setText(item.getTitle());
            if(item.isSelect())
            {
                mItemBinding.btnItemGallery.setTextColor(mItemBinding.getRoot().getContext().getResources().getColor(R.color.selected_color));
            }
            else {
                mItemBinding.btnItemGallery.setTextColor(mItemBinding.getRoot().getContext().getResources().getColor(R.color.disselect_color));
            }
        }
    }


}
