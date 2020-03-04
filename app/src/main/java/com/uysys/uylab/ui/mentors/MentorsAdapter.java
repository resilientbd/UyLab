package com.uysys.uylab.ui.mentors;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.uysys.util.remote.model.mentor_profile.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.MentorsRecylerBinding;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;
import com.uysys.uylab.ui.ourPartner.OfficialPartnerAdapter;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class MentorsAdapter extends BaseAdapter<Datum> {


    @Override
    public boolean isEqual(Datum left, Datum right) {
        return false;
    }

    @Override
    public BaseViewHolder<Datum> newViewHolder(ViewGroup parent, int viewType) {
        return new MentorAdapterViewHolder(inflate(parent,R.layout.mentors_recyler));
    }
    private class MentorAdapterViewHolder extends BaseAdapterViewHolder<Datum>{
    private MentorsRecylerBinding mItemBinding;
        public MentorAdapterViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            mItemBinding= (MentorsRecylerBinding) viewDataBinding;
        }

        @Override
        public void bind(Datum item) {
            Picasso.with(mItemBinding.getRoot().getContext()).load(item.getPhoto()).error(R.drawable.default_img).into(mItemBinding.profileImage);
            mItemBinding.textView19.setText(item.getDesignation());
            mItemBinding.textView14.setText(item.getName());
        }
    }








}
