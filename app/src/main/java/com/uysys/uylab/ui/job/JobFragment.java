package com.uysys.uylab.ui.job;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.studentmain.FragmentListener;

public class JobFragment extends BaseFragment implements View.OnClickListener {

private View view;
private RecyclerView recyclerView;
private  JobAdapter jobAdapter;
private FragmentListener listener;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_job,container,false);
        recyclerView=view.findViewById(R.id.job_recycle);
        jobAdapter=new JobAdapter();
        recyclerView.setAdapter(jobAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1));
        return view;
    }
    public void setListener(FragmentListener listener) {
        this.listener=listener;
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.constraintLayout:





        }

    }
}
