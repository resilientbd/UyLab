package com.uysys.uylab.ui.ourPartner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Partner_Fragment extends BaseFragment {
    private View view;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private OfficialPartnerAdapter officialPartnerAdapter;
    private ConcernAdapter concernAdapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_our_partner,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView1 = view.findViewById(R.id.recyclerView1);
        officialPartnerAdapter=new OfficialPartnerAdapter();
        recyclerView.setAdapter(officialPartnerAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));

        concernAdapter =new ConcernAdapter();
        recyclerView1.setAdapter(concernAdapter);
        recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(),3));
        //recyclerView1.setLayoutManager(new GridLayoutManager(OurPartnerActivity.this,3));
        return view;
    }
}
