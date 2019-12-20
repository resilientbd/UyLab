package com.uysys.uylab.ui.upcomming_batch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class Upcoming_batch_fragment extends BaseFragment {
    private View upcoming_batch_view;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        upcoming_batch_view=inflater.inflate(R.layout.activity_upcomming_batch,container,false);
        return upcoming_batch_view;
    }
}
