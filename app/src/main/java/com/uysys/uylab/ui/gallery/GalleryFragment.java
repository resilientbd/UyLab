package com.uysys.uylab.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class GalleryFragment extends BaseFragment {
    private View view;
    private RecyclerView recyclerView;
    private GalleryAdapter mAdapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_gallery,container,false);
        recyclerView=view.findViewById(R.id.recycleview_pro_20);
        mAdapter=new GalleryAdapter();
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyclerView.setAdapter(mAdapter);
        return view;
    }
}
