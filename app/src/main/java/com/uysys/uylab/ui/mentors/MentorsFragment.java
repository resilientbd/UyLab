package com.uysys.uylab.ui.mentors;

import android.content.Intent;
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

public class MentorsFragment extends BaseFragment implements MentorsAdapter.MentorsAdapterClickListener {
    private View view;
    private RecyclerView recyclerView;
    private MentorsAdapter mentorsAdapter;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_mentors,container,false);
        recyclerView =view.findViewById(R.id.recyclerView2);
        mentorsAdapter = new MentorsAdapter();
        recyclerView.setAdapter(mentorsAdapter);

        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        mentorsAdapter.setMentorsAdapterClickListener(this);

        return view;
    }

    @Override
    public void onMentorsItemClick(int position) {
        Intent intent=new Intent(getActivity(),MentorsProfileActivity.class);
        startActivity(intent);
    }
}
