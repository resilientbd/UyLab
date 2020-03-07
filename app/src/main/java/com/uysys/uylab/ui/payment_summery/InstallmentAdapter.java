package com.uysys.uylab.ui.payment_summery;

import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;

import com.uysys.util.remote.model.paymentSummary.Installment;
import com.uysys.util.remote.model.paymentSummary.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ItemSummeryIndividualBinding;
import com.uysys.uylab.databinding.ItemSummeryMainBinding;
import com.uysys.uylab.ui.base.BaseAdapter;
import com.uysys.uylab.ui.base.BaseViewHolder;

public class InstallmentAdapter extends BaseAdapter<Installment> {
    @Override
    public boolean isEqual(Installment left, Installment right) {
        return false;
    }

    @Override
    public BaseViewHolder<Installment> newViewHolder(ViewGroup parent, int viewType) {
        return new PaymentSummeryAdapterViewHolder(inflate(parent, R.layout.item_summery_individual));
    }
    private class PaymentSummeryAdapterViewHolder extends BaseAdapterViewHolder<Installment>{
    ItemSummeryIndividualBinding mItemBinding;
        public PaymentSummeryAdapterViewHolder(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            mItemBinding= (ItemSummeryIndividualBinding) getViewDataBinding();
        }

        @Override
        public void bind(Installment item) {
            int num=getAdapterPosition()+1;
            String stringNum="";
            if(num<10)
            {
                stringNum="0"+num;
            }
            else {
                stringNum=""+num;
            }
            mItemBinding.textView41.setText(""+stringNum);
            mItemBinding.textView42.setText("Due Fee: BDT "+item.getInstallmentAmount());
            mItemBinding.textView43.setText("Deadline: "+item.getInstallmentDate());


            int color0=R.color.status0;
            int color1=R.color.status1;

            if (item.getStatus()==0)
            {
                mItemBinding.background.setBackgroundTintList(ContextCompat.getColorStateList(mItemBinding.getRoot().getContext(),color0));
            }
            else {
                mItemBinding.background.setBackgroundTintList(ContextCompat.getColorStateList(mItemBinding.getRoot().getContext(),color1));
            }
        }
    }

}
