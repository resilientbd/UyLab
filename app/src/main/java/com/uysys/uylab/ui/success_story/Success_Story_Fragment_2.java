package com.uysys.uylab.ui.success_story;

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

public class Success_Story_Fragment_2 extends BaseFragment {
    private View view;
    private Success_Story2_Adapter success_story2_adapter;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.success_story_2,container,false);
        recyclerView =view.findViewById(R.id.recyclerView);
        success_story2_adapter = new Success_Story2_Adapter();
        recyclerView.setAdapter(success_story2_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
