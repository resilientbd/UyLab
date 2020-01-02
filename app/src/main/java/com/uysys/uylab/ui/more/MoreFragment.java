package com.uysys.uylab.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.Contact.ContactFragment;
import com.uysys.uylab.ui.about_us.About_usFrgment;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.gallery.GalleryFragment;
import com.uysys.uylab.ui.mentors.MentorsFragment;
import com.uysys.uylab.ui.ourPartner.Partner_Fragment;
import com.uysys.uylab.ui.setting.Setting_Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoreFragment extends BaseFragment {
    private View view;
    //private Button applyBtn;
    private View mentorsView;
    private View contact;
    private  View about_us;

    private View settingsView;
    private View partnerView;
    private View coursesView;
    private View galleryView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_more,container,false);
        contact=view.findViewById(R.id.contact);
        about_us=view.findViewById(R.id.aboutUs);
        mentorsView=view.findViewById(R.id.mentorsViewn);
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
                contact.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(getFragmentListener()!=null){
                            ContactFragment contact=new ContactFragment();
                            contact.setFragmentListener(getFragmentListener());
                            getFragmentListener().onAddFragment(contact);
                        }
                    }
                });
                about_us.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (getFragmentListener()!=null){
                            About_usFrgment about_usFrgment=new About_usFrgment();
                            about_usFrgment.setFragmentListener(getFragmentListener());
                            getFragmentListener().onAddFragment(about_usFrgment);
                        }
                    }
                });


        return view;


    }

}
