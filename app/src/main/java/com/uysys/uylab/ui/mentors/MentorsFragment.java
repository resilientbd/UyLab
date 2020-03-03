package com.uysys.uylab.ui.mentors;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.util.ApiUtil;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.util.remote.retrofit.Retrofitutil1;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ActivityMentorsBinding;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.base.MyBaseFragment;

public class MentorsFragment extends MyBaseFragment implements MentorsAdapter.MentorsAdapterClickListener {
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
        mentorsAdapter.setMentorsAdapterClickListener(this);
        mService = RemoteApiProvider.getInstance().getRemoteApi();
        mUtil = new Retrofitutil1();

    }


    @Override
    public void onMentorsItemClick(int position) {
        Intent intent = new Intent(getActivity(), MentorsProfileActivity.class);
        startActivity(intent);
    }
}
