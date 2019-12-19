package com.uysys.uylab.ui.terms_and_conditions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class Terms_and_conditions_fragments extends BaseFragment {
    private View terms_and_conditions_view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        terms_and_conditions_view=inflater.inflate(R.layout.activity_terms_and_conditions,container,false);
        return terms_and_conditions_view;
    }
}
