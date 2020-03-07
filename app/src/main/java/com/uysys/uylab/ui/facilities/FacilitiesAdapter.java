package com.uysys.uylab.ui.facilities;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;

import com.uysys.util.remote.model.facility.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemFacilityBinding;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FacilitiesAdapter extends BaseAdapter<Datum> {
    private Map<Integer,Integer> colorMap;

    public FacilitiesAdapter() {

       colorMap=new HashMap<>();
       colorMap.put(0,R.color.color_0);
       colorMap.put(1,R.color.color_1);
       colorMap.put(2,R.color.color_2);
       colorMap.put(3,R.color.color_3);
       colorMap.put(4,R.color.color_4);
       colorMap.put(5,R.color.color_5);
       colorMap.put(6,R.color.color_6);
    }

    @Override
    public boolean isEqual(Datum left, Datum right) {
        return false;
    }

    @Override
    public BaseViewHolder<Datum> newViewHolder(ViewGroup parent, int viewType) {
        return new FacilitiesAdapterViewHolder(inflate(parent, R.layout.item_facility));
    }
    private class FacilitiesAdapterViewHolder extends BaseViewHolder<Datum>{
    private ItemFacilityBinding mItemBinding;
        public FacilitiesAdapterViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            mItemBinding= (ItemFacilityBinding) getViewDataBinding();
        }

        @Override
        public void bind(Datum item) {
            Random random=new Random();
            int num=getAdapterPosition();
            if(num>6)
            {
                num=random.nextInt(6);
            }
            mItemBinding.btnExplandClose.setText(item.getTitle());

            mItemBinding.btnExplandClose.setBackgroundTintList(ContextCompat.getColorStateList(mItemBinding.getRoot().getContext(),colorMap.get(num)));
        }

        @Override
        public void onClick(View v) {

        }
    }
}
