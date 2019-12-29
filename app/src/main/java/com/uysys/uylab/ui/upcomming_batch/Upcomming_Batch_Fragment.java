package com.uysys.uylab.ui.upcomming_batch;

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

public class Upcomming_Batch_Fragment extends BaseFragment {

    private View view;
    private RecyclerView recyclerView;
    private Batch_Adapter batch_adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.upcoming_batch,container,false);

        recyclerView = view.findViewById(R.id.recyclerView);
        batch_adapter = new Batch_Adapter();

        recyclerView.setAdapter(batch_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }
}
