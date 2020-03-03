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

import com.uysys.util.ProgressbarHandler;
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
import com.uysys.uylab.ui.base.ItemClickListener;

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

    List<Datum> data;
    int prevIndex=0;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_gallery, container, false);
        view = mBinding.getRoot();

        mAdapter = new GalleryAdapter();
        mHeaderAdapter = new GalleryHeaderAdapter();
        mBinding.recycleviewPro20.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        mBinding.recycleviewPro20.setAdapter(mAdapter);

        mBinding.recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        mBinding.recyclerView4.setAdapter(mHeaderAdapter);
        init();

        mHeaderAdapter.setItemClickListener(new ItemClickListener<Datum>() {

            @Override
            public void onItemClick(View view, Datum item, int index) {
                ProgressbarHandler.ShowLoadingProgress(getActivity());

                selectDataIndex(index);
            }
        });
        return view;
    }

    private void init() {
        mService = RemoteApiProvider.getInstance().getRemoteApi();
        mUtil = new Retrofitutil1();
        mUtil.setRetrofitutillistener(this);
        Call call = mService.gallery();
        ProgressbarHandler.ShowLoadingProgress(getActivity());
        mUtil.networkCall(call);
    }

    private void selectDataIndex(int index)
    {
        mHeaderAdapter.getItem(prevIndex).setSelect(false);
        mHeaderAdapter.getItem(index).setSelect(true);

       mAdapter.clear();
       mAdapter.addItems(mHeaderAdapter.getItem(index).getPhotos());
       mHeaderAdapter.notifyDataSetChanged();
       prevIndex=index;
       ProgressbarHandler.DismissProgress(getActivity());
    }
    @Override
    public void onSuccess(Object object) {
        if (object != null) {
            try {
                Gallery gallery = (Gallery) object;
                data = gallery.getData();

//                mAdapter.addItems(data.get(0).getPhotos());
//
                mHeaderAdapter.clear();
                mHeaderAdapter.addItems(data);
                selectDataIndex(0);

            } catch (Exception e) {

            }

        }
        ProgressbarHandler.DismissProgress(getActivity());
    }

    @Override
    public void onError(String messege) {
        ProgressbarHandler.DismissProgress(getActivity());
    }
}
