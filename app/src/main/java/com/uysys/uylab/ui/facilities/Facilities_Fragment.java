package com.uysys.uylab.ui.facilities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.base.MyBaseFragment;

public class Facilities_Fragment extends MyBaseFragment {
    public View view;

    @Override
    public int setLayoutId() {
        return 0;
    }

    @Override
    public void startUI() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.facilities_fragment,container,false);
        return view;
    }
}
