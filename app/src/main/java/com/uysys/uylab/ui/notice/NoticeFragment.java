package com.uysys.uylab.ui.notice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.notice.Datum;
import com.uysys.util.remote.model.notice.Notice;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.util.remote.retrofit.Retrofitutil1;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentNoticeBinding;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import retrofit2.Call;

public class NoticeFragment extends Fragment implements Retrofitutil1.Retrofitutillistener {

    private View view;
    List <Datum> datalist;
    FragmentNoticeBinding noticeBinding;
    NoticelatestAdapter latestAdapter;
    private RemoteApiInterface mService;
    private Retrofitutil1 mUtil;
    private List<Datum> leatestList;
    private List<Datum> oldestList;
    private Button btneditprofile;
    private FragmentManager manager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        noticeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_notice,container,false);
        view = noticeBinding.getRoot();
        datalist = new ArrayList<>();
        latestAdapter=new NoticelatestAdapter(datalist);
        noticeBinding.latestrecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        noticeBinding.latestrecycler.setAdapter(latestAdapter);
        init();
        return view;

    }
    private void init(){
        mService= RemoteApiProvider.getInstance(getActivity()).getRemoteApi();
        mUtil=new Retrofitutil1();
        mUtil.setRetrofitutillistener(this);
        Call call = mService.notice();
        mUtil.networkCall(call);
    }


    @Override
    public void onSuccess(Object object) {

        if (object!=null){

            try {
                Notice notice = (Notice) object;
                List<Datum> datalist2 = notice.getData();
                datalist.clear();
                datalist.addAll(datalist2);
                latestAdapter.notifyDataSetChanged();
            }
            catch (Exception e){

            }

        }

    }

    @Override
    public void onError(String messege) {

    }
    public void filterData(List<Datum> datum)
    {
        Date date=new Date();
        for(Datum datum1:datum)
        {
            String string=datum1.getPublishedAt();
        }

    }
}
