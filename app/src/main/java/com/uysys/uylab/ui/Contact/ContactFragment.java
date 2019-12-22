package com.uysys.uylab.ui.Contact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class ContactFragment extends BaseFragment {
    private View view;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.contact,container,false);
        return view;
    }
}
