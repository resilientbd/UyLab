package com.uysys.uylab.ui.payment_summery;

import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.uysys.util.remote.model.paymentSummary.Datum;
import com.uysys.util.remote.model.paymentSummary.Installment;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemSummeryMainBinding;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;

import java.util.List;

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
            InstallmentAdapter mAdapter=new InstallmentAdapter();
            mItemBinding.itemDetailsRecycler.setLayoutManager(new LinearLayoutManager(mItemBinding.getRoot().getContext()));
            mItemBinding.itemDetailsRecycler.setAdapter(mAdapter);
            List<Installment> installments=item.getInstallments();
            mAdapter.addItems(installments);

            mItemBinding.text5.setText(item.getCourseName()+" | "+item.getBatchId());
            mItemBinding.textView6.setText("Course Fee: BDT "+item.getAmountPayable());
            mItemBinding.textView7.setText("Paid: BDT "+item.getTotalPaid());



        }
    }

}
