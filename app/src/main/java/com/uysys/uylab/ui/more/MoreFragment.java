package com.uysys.uylab.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.backupsubmit.BackupSubmitFragment;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.mentors.MentorsFragment;
import com.uysys.uylab.ui.ourPartner.Partner_Fragment;
import com.uysys.uylab.ui.setting.Setting_Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoreFragment extends BaseFragment {
    private View view;
    //private Button applyBtn;
    private View mentorsView;
    private View settingsView;
    private View partnerView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_more,container,false);
        mentorsView=view.findViewById(R.id.mentorsViewn);
        settingsView = view.findViewById(R.id.settingViewn);
        partnerView = view.findViewById(R.id.partnerViwen);
        //applyBtn=view.findViewById(R.id.button10);
//        applyBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(getFragmentListener()!=null)
//                {
//                    BackupSubmitFragment fragment=new BackupSubmitFragment();
//                    fragment.setFragmentListener(getFragmentListener());
//                    getFragmentListener().onAddFragment(fragment);
//                }
//            }
//        });
        mentorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    MentorsFragment fragment=new MentorsFragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });

        settingsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    Setting_Fragment fragment=new Setting_Fragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });
        partnerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    Partner_Fragment fragment=new Partner_Fragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });
        return view;
    }
}
