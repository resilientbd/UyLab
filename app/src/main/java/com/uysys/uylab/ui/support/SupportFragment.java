package com.uysys.uylab.ui.support;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.backupsubmit.BackupSubmitFragment;
import com.uysys.uylab.ui.base.BaseFragment;

public class SupportFragment extends BaseFragment {
    private View view;

    private SupportAdapter mAdapter;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_support,container,false);

        mAdapter=new SupportAdapter();
        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return view;
    }
}
