package com.uysys.uylab.ui.facilities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import java.util.zip.Inflater;

public class Facilities_Fragment extends BaseFragment {
    public View view;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.activity_facilities_,container,false);
        return view;
    }
}
