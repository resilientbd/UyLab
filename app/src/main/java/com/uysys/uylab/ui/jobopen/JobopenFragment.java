package com.uysys.uylab.ui.jobopen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class JobopenFragment extends BaseFragment  {
private View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.job_open,container,false);

        return view;
    }
}
