package com.uysys.uylab.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.uysys.uylab.ui.studentmain.FragmentListener;

public abstract class BaseFragment extends Fragment {

    private FragmentListener fragmentListener;

    public void setFragmentListener(FragmentListener fragmentListener) {
        this.fragmentListener = fragmentListener;
    }
    public abstract View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState);

    public FragmentListener getFragmentListener() {
        return fragmentListener;
    }
}
