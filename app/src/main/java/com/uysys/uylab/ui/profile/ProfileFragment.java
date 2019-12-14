package com.uysys.uylab.ui.profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.uysys.uylab.R;
import com.uysys.uylab.ui.profile1.EditProfileFragement;

public class ProfileFragment extends Fragment {

    private View view;
    private Button btneditprofile;
    private FragmentManager manager;
    private EditProfileFragement editProfileFragement;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_profile, container, false);
        manager=getChildFragmentManager();
        btneditprofile=view.findViewById(R.id.editprofilebtn);
        btneditprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;

    }


}
