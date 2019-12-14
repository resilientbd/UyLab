package com.uysys.uylab.ui.base;

import androidx.fragment.app.Fragment;

import com.uysys.uylab.ui.studentmain.FragmentListener;

public class BaseFragment extends Fragment {
    private FragmentListener fragmentListener;

    public void setFragmentListener(FragmentListener fragmentListener) {
        this.fragmentListener = fragmentListener;
    }
}
