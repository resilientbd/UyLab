package com.uysys.uylab.ui.liveClass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.mentors.MentorsAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Live_Class extends BaseFragment {
    private View view;
    private RecyclerView recyclerView;
    private Live_Class_Adapter live_class_adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_live_class,container,false);
        live_class_adapter = new Live_Class_Adapter();
        recyclerView.setAdapter(live_class_adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager((getActivity())));


        return view;

    }
}
