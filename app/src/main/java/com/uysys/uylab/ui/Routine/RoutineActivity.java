package com.uysys.uylab.ui.Routine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uysys.util.ProgressbarHandler;
import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ActivityRoutineBinding;
import com.uysys.uylab.ui.base.BaseActivity;
import com.uysys.uylab.ui.test_finished.Test_Finished_Activity;

import retrofit2.Call;

public class RoutineActivity extends BaseActivity implements RetrofitUtil.RetrofitUtilListener {
    ActivityRoutineBinding mBinding;
    private RoutinePagerAdapter mAdapter;
    private RemoteApiInterface mService;
    private RetrofitUtil mUtil;

    @Override
    public int setLayoutId() {
        return R.layout.activity_routine;
    }

    @Override
    public void startUI() {
        mBinding = (ActivityRoutineBinding) getViewDataBinding();
        mAdapter = new RoutinePagerAdapter(getSupportFragmentManager(), RoutinePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mBinding.routineViewPager.setAdapter(mAdapter);
        mService = RemoteApiProvider.getInstance(RoutineActivity.this).getRemoteApi();
        mUtil = new RetrofitUtil();
        mUtil.setRetrofitUtilListener(this);
        mBinding.swaptToRefresh.setOnRefreshListener(() -> {
            callRoutinApi();
        });
        ProgressbarHandler.ShowLoadingProgress(this);
        callRoutinApi();

    }

    private void callRoutinApi() {

        Call call = mService.cls_routine();
        mUtil.networkcall(call);
    }


    @Override
    public void onSuccess(Object object) {
        ProgressbarHandler.DismissProgress(this);
        if(mBinding.swaptToRefresh.isRefreshing())
        {
            mBinding.swaptToRefresh.setRefreshing(false);

        }
        if(object instanceof com.uysys.util.remote.model.classRoutine.ClassRoutine)
        {
            com.uysys.util.remote.model.classRoutine.ClassRoutine classRoutine= (com.uysys.util.remote.model.classRoutine.ClassRoutine) object;
            mAdapter.addItems(classRoutine.getData());
        }
    }

    @Override
    public void onError(String messege) {
        ProgressbarHandler.DismissProgress(this);
    }
}
