package com.uysys.uylab.ui.tutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_Tutorial_Video extends BaseFragment {
    private View view;

    private RecyclerView recyclerView;
    private Tutorial_Video_Adapter tutorial_video_adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tutorial_video,container,false);

        recyclerView =view.findViewById(R.id.recylerviewnew);
        tutorial_video_adapter = new Tutorial_Video_Adapter();
        recyclerView.setAdapter(tutorial_video_adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager((getActivity())));

        return view;
    }
}
