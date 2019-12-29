package com.uysys.uylab.ui.courses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Our_Courses_Fragment extends BaseFragment {

    private View view;
     @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.our_courses_fragment,container,false);
         return view;
    }
}
