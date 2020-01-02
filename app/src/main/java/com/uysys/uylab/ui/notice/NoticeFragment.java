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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.notice.Datum;
import com.uysys.util.remote.model.notice.Notice;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentNoticeBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class NoticeFragment extends Fragment implements RetrofitUtil.RetrofitUtilListener {

    private View view;
    private Button btneditprofile;
    private FragmentManager manager;
    private FragmentNoticeBinding nBinding;
    private List<Datum> list;
    private NewestNotice_Adapter nAdapter;
    private RemoteApiInterface apiInterface;
    private RetrofitUtil util;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        nBinding = DataBindingUtil.inflate ( inflater,R.layout.fragment_notice,container,false );
        view=nBinding.getRoot ();
        list = new ArrayList<> ();
        nAdapter = new NewestNotice_Adapter ( list );
        nBinding.newestRecycler.setLayoutManager ( new LinearLayoutManager ( getActivity () ) );
        nBinding.newestRecycler.setAdapter ( nAdapter );
        return view;
    }

    public void Init(){
        apiInterface= RemoteApiProvider.getInstance ().getRemoteApi ();
        util= new RetrofitUtil ();
        util.setRetrofitUtilListener ( this );
        Call call = apiInterface.notice ();
        util.networkcall ( call );
    }

    @Override
    public void onSuccess(Object object) {
        if(object!=null){
            Notice notice = (Notice) object;
            List<Datum> list = notice.getData ();
            list.clear ();
        }
    }

    @Override
    public void onError(String messege) {

    }
}
