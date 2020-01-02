package com.uysys.uylab.ui.tutorial;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.tutorial.Popular;
import com.uysys.util.remote.model.tutorial.Recent;
import com.uysys.util.remote.model.tutorial.TutorialModel;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentTutorialBinding;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class Fragment_Tutorial  extends BaseFragment implements Tutorial_Popular_Adapter.Tutorial_Popular_AdapterClickLisiner, RetrofitUtil.RetrofitUtilListener {
    FragmentTutorialBinding mBinding;
    private View view;

    private Tutorial_Popular_Adapter tutorial_popular_adapter;
    private Tutorial_Recent_Adapter tutorial_recent_adapter;
    private RemoteApiInterface mService;
    private RetrofitUtil mUtil;
    private List<Popular> popularList;
    private List<Recent> recentList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       mBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_tutorial,container,false);
        view = mBinding.getRoot();

        popularList=new ArrayList<>();
        recentList=new ArrayList<>();
        tutorial_popular_adapter = new Tutorial_Popular_Adapter(popularList);
        mBinding.recyclerView.setAdapter(tutorial_popular_adapter);

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        tutorial_recent_adapter = new Tutorial_Recent_Adapter(recentList);
        mBinding.recyclerView1.setAdapter(tutorial_recent_adapter);
        mBinding.recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));


        tutorial_popular_adapter.setTutroial_Popular_adapterClickListener(this);


         mService= RemoteApiProvider.getInstance().getRemoteApi();
        mUtil=new RetrofitUtil();
        Call call=mService.tutorial();
        mUtil.networkcall(call);
        mUtil.setRetrofitUtilListener(this);
        return view;

    }


    @Override
    public void onLive_classItemClick(int position) {

            if(getFragmentListener()!=null)
            {
                Fragment_Tutorial_Video frag=new Fragment_Tutorial_Video();
                frag.setFragmentListener(getFragmentListener());
                getFragmentListener().onAddFragment(frag);
            }
        }

    @Override
    public void onSuccess(Object object) {
        Log.d("chk",""+object.toString());
        TutorialModel tutorialModel= (TutorialModel) object;
        List<Popular> populars=tutorialModel.getData().getPopular();
        List<Recent> recents=tutorialModel.getData().getRecent();

        popularList.clear();
        popularList.addAll(populars);

        recentList.clear();
        recentList.addAll(recents);

        tutorial_popular_adapter.notifyDataSetChanged();
        tutorial_recent_adapter.notifyDataSetChanged();

    }

    @Override
    public void onError(String messege) {
        Log.d("chk",""+messege);
    }
}

