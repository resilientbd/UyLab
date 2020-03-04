package com.uysys.uylab.ui.facilities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.facility.FacilityList;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FacilitiesFragmentBinding;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.base.MyBaseFragment;

import retrofit2.Call;

public class Facilities_Fragment extends MyBaseFragment implements RetrofitUtil.RetrofitUtilListener {
    public View view;
    FacilitiesFragmentBinding mBinding;
    private RemoteApiInterface mService;
    RetrofitUtil mUtil;
    private FacilitiesAdapter mAdapter;
    @Override
    public int setLayoutId() {
        return R.layout.facilities_fragment;
    }

    @Override
    public void startUI() {
    mBinding= (FacilitiesFragmentBinding) getViewDataBinding();
    mUtil=new RetrofitUtil();
    mService= RemoteApiProvider.getInstance(getActivity()).getRemoteApi();
    mUtil.setRetrofitUtilListener(this);
    mAdapter=new FacilitiesAdapter();
    mBinding.facilitesRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
    mBinding.facilitesRecycler.setAdapter(mAdapter);
    mBinding.swaptToRefresh.setOnRefreshListener(() -> {
        callApi();
    });
        callApi();
    }
    private void callApi()
    {
        Call call=mService.facility();
        mUtil.networkcall(call);
    }


    @Override
    public void onSuccess(Object object) {
        if(object instanceof FacilityList)
        {
            FacilityList facility= (FacilityList) object;
            mAdapter.clear();
            mAdapter.addItems(facility.getData());
        }
        mBinding.swaptToRefresh.setRefreshing(false);
    }

    @Override
    public void onError(String messege) {
        mBinding.swaptToRefresh.setRefreshing(false);
    }
}
