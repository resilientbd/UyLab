package com.uysys.uylab.ui.payment_summery;

import android.view.ViewGroup;

import androidx.databinding.ViewDataBinding;

import com.uysys.util.remote.model.paymentSummary.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemSummeryMainBinding;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;

public class PaymentSummeyrAdapterMain extends BaseAdapter<Datum> {
    @Override
    public boolean isEqual(Datum left, Datum right) {
        return false;
    }

    @Override
    public BaseViewHolder<Datum> newViewHolder(ViewGroup parent, int viewType) {
        return new PaymentSummeryAdapterViewHolder(inflate(parent, R.layout.item_summery_main));
    }
    private class PaymentSummeryAdapterViewHolder extends BaseAdapterViewHolder<Datum>{
    ItemSummeryMainBinding mItemBinding;
        public PaymentSummeryAdapterViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            mItemBinding= (ItemSummeryMainBinding) getViewDataBinding();
        }

        @Override
        public void bind(Datum item) {

        }
    }

}
