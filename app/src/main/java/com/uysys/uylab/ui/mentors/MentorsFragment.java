package com.uysys.uylab.ui.mentors;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.util.ApiUtil;
import com.google.gson.Gson;
import com.uysys.util.AppConstraints;
import com.uysys.util.remote.model.mentor_profile.Datum;
import com.uysys.util.remote.model.mentor_profile.MentorProfile;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.util.remote.retrofit.Retrofitutil1;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ActivityMentorsBinding;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.base.MyBaseFragment;

import java.util.List;

import retrofit2.Call;

public class MentorsFragment extends MyBaseFragment implements Retrofitutil1.Retrofitutillistener {
    private View view;
    private RecyclerView recyclerView;
    private MentorsAdapter mentorsAdapter;
    ActivityMentorsBinding mBinding;
    private RemoteApiInterface mService;
    private Retrofitutil1 mUtil;

    @Override
    public int setLayoutId() {
        return R.layout.activity_mentors;

    }

    @Override
    public void startUI() {
        mBinding = (ActivityMentorsBinding) getViewDataBinding();
        recyclerView = mBinding.recyclerView2;
        mentorsAdapter = new MentorsAdapter();
        recyclerView.setAdapter(mentorsAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        mService = RemoteApiProvider.getInstance(getActivity()).getRemoteApi();
        mUtil = new Retrofitutil1();

        mUtil.setRetrofitutillistener(this);

        mentorsAdapter.setItemClickListener((view1, item, index) -> {
            Intent intent = new Intent(getActivity(), MentorsProfileActivity.class);
            Gson gson = new Gson();
            String objectString = gson.toJson(item);
            intent.putExtra(AppConstraints.IntentConstrants.Data, objectString);
            startActivity(intent);
        });
        mBinding.swaptToRefresh.setOnRefreshListener(() -> {
            callAPi();
        });
        callAPi();

    }
    private void callAPi(){
        Call call = mService.mentor_profile();
        mUtil.networkCall(call);
    }

//


    @Override
    public void onSuccess(Object object) {
        if (object != null) {

            MentorProfile mentorProfile = (MentorProfile) object;
            List<Datum> data = mentorProfile.getData();
            mentorsAdapter.clear();
            mentorsAdapter.addItems(data);
        }
        mBinding.swaptToRefresh.setRefreshing(false);
    }

    @Override
    public void onError(String messege) {
        mBinding.swaptToRefresh.setRefreshing(false);
    }
}
