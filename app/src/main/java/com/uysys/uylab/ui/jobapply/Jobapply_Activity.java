package com.uysys.uylab.ui.jobapply;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class Jobapply_Activity extends BaseFragment {

private View view;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_jobapply,container,false);
        return view;
    }
}
