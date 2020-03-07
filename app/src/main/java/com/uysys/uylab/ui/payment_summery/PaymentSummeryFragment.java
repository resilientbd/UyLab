package com.uysys.uylab.ui.payment_summery;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.squareup.picasso.Picasso;
import com.uysys.util.ProgressbarHandler;
import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.paymentSummary.PaymentSummary;
import com.uysys.util.remote.model.profile.ProfileModel;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentPaymentSummeryBinding;
import com.uysys.uylab.ui.base.MyBaseFragment;
import com.uysys.util.remote.model.paymentSummary.Datum;
import retrofit2.Call;

public class PaymentSummeryFragment extends MyBaseFragment implements RetrofitUtil.RetrofitUtilListener {
    FragmentPaymentSummeryBinding mBinding;
    private RemoteApiInterface mService;
    private RetrofitUtil mUtil;
    private PaymentSummeyrAdapterMain mAdapter;
    @Override
    public int setLayoutId() {
        return R.layout.fragment_payment_summery;
    }

    @Override
    public void startUI() {
        mBinding= (FragmentPaymentSummeryBinding) getViewDataBinding();

        mUtil=new RetrofitUtil();
        mService= RemoteApiProvider.getInstance(getActivity()).getRemoteApi();
        mAdapter=new PaymentSummeyrAdapterMain();
        mBinding.summeryRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        mBinding.summeryRecycler.setAdapter(mAdapter);
        mUtil.setRetrofitUtilListener(this);

        callSummeryAPi();
    }

    private void callSummeryAPi() {
        Call call=mService.paymentSum();
        ProgressbarHandler.ShowLoadingProgress(getActivity());
        mUtil.networkcall(call);

        Call call12=mService.profile();
        mUtil.networkcall(call12);
    }

    @Override
    public void onSuccess(Object object) {
        if(object instanceof PaymentSummary){
            PaymentSummary paymentSummary= (PaymentSummary) object;
            mAdapter.addItems(paymentSummary.getData());
            ProgressbarHandler.DismissProgress(getActivity());
        }
        if(object instanceof ProfileModel)
        {
            ProfileModel model= (ProfileModel) object;
            mBinding.textView.setText(model.getData().getName());
            mBinding.idtext.setText(""+model.getData().getId());
            mBinding.paidamount.setText(""+model.getData().getPoint());
            Picasso.with(getActivity()).load(model.getData().getPhoto()).error(R.drawable.default_img).into(mBinding.imageView3);

        }
    }

    @Override
    public void onError(String messege) {
        ProgressbarHandler.DismissProgress(getActivity());
    }
}
