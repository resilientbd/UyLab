package com.uysys.uylab.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.gallery.GalleryFragment;
import com.uysys.uylab.ui.mentors.MentorsFragment;
import com.uysys.uylab.ui.terms_and_conditions.Terms_and_conditions_fragments;
import com.uysys.uylab.ui.ourPartner.Partner_Fragment;
import com.uysys.uylab.ui.setting.Setting_Fragment;
import com.uysys.uylab.ui.ourPartner.Partner_Fragment;
import com.uysys.uylab.ui.setting.Setting_Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoreFragment extends BaseFragment {
    private View view;
    //private Button applyBtn;
    private View mentorsView;
    private View terms_view;

    //

    private View settingsView;
    private View partnerView;
    private View coursesView;
    private View galleryView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_more,container,false);
        mentorsView=view.findViewById(R.id.mentorsViewn);
        terms_view=view.findViewById(R.id.terms_and_conditions_id);
        settingsView = view.findViewById(R.id.settingViewn);
        partnerView = view.findViewById(R.id.partnerViwen);
        coursesView=view.findViewById(R.id.course);
        galleryView=view.findViewById(R.id.gallerybtn);
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
        galleryView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    GalleryFragment galleryFragment=new GalleryFragment();
                    galleryFragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(galleryFragment);
                }
            }
        });
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

        terms_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener() != null)
                {
                    Terms_and_conditions_fragments fragments=new Terms_and_conditions_fragments();
                    fragments.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragments);
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
