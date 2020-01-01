package com.uysys.uylab.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.model.gallery.Datum;
import com.uysys.util.remote.model.gallery.Gallery;
import com.uysys.util.remote.model.gallery.Photo;
import com.uysys.util.remote.model.tutorial.Data;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.util.remote.retrofit.Retrofitutil1;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentGalleryBinding;
import com.uysys.uylab.ui.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class GalleryFragment extends BaseFragment implements Retrofitutil1.Retrofitutillistener {
    private View view;

    private GalleryAdapter mAdapter;
    private GalleryHeaderAdapter mHeaderAdapter;

    private FragmentGalleryBinding mBinding;
    private RemoteApiInterface mService;
    private Retrofitutil1 mUtil;
    List<Datum> dataList;
    List<Photo> photoList;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_gallery,container,false);
        view=mBinding.getRoot();
        dataList=new ArrayList<>();
        photoList=new ArrayList<>();
        mAdapter=new GalleryAdapter(photoList);
        mHeaderAdapter=new GalleryHeaderAdapter(dataList);
        mBinding.recycleviewPro20.setLayoutManager(new GridLayoutManager(getActivity(),2));
        mBinding.recycleviewPro20.setAdapter(mAdapter);

        mBinding.recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
       mBinding.recyclerView4.setAdapter(mHeaderAdapter);
        init();
        return view;
    }
    private void init(){
        mService= RemoteApiProvider.getInstance().getRemoteApi();
        mUtil=new Retrofitutil1();
        mUtil.setRetrofitutillistener(this);
        Call call=mService.gallery();
        mUtil.networkCall(call);
    }

    @Override
    public void onSuccess(Object object) {
        if(object!=null)
        {
            try {
                Gallery gallery= (Gallery) object;
                List<Datum> data= gallery.getData();
                photoList.clear();
                photoList.addAll( data.get(0).getPhotos());
                mAdapter.notifyDataSetChanged();

                dataList.clear();
                dataList.addAll(data);
                mHeaderAdapter.notifyDataSetChanged();

            }
            catch (Exception e)
            {

            }

        }
    }

    @Override
    public void onError(String messege) {

    }
}
