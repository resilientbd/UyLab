package com.uysys.uylab.ui.point;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class Point1_Fragment extends BaseFragment {
    private Adapter_Points1 adapter_points1;
    private RecyclerView recyclerView;

    View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.activity_point1,container,false);
        recyclerView = view.findViewById(R.id.points1_recycler);
        adapter_points1 = new Adapter_Points1();
        recyclerView.setAdapter(adapter_points1);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        return view;
    }
}
