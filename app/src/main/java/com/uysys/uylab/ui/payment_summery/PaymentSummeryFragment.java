package com.uysys.uylab.ui.payment_summery;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.paymentSummary.PaymentSummary;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentPaymentSummeryBinding;
import com.uysys.uylab.ui.base.MyBaseFragment;

import retrofit2.Call;

public class PaymentSummeryFragment extends MyBaseFragment implements RetrofitUtil.RetrofitUtilListener {
    FragmentPaymentSummeryBinding mBinding;
    private RemoteApiInterface mService;
    private RetrofitUtil mUtil;
    @Override
    public int setLayoutId() {
        return R.layout.fragment_payment_summery;
    }

    @Override
    public void startUI() {
        mBinding= (FragmentPaymentSummeryBinding) getViewDataBinding();

        mUtil=new RetrofitUtil();
        mService= RemoteApiProvider.getInstance(getActivity()).getRemoteApi();

        mUtil.setRetrofitUtilListener(this);

        callSummeryAPi();
    }

    private void callSummeryAPi() {
        Call call=mService.paymentSum();
        mUtil.networkcall(call);
    }

    @Override
    public void onSuccess(Object object) {
        if(object instanceof PaymentSummary){
            PaymentSummeryFragment paymentSummeryFragment= (PaymentSummeryFragment) object;

        }
    }

    @Override
    public void onError(String messege) {

    }
}
