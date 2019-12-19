package com.uysys.uylab.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.Contact.ContactFragment;
import com.uysys.uylab.ui.about_us.About_usFrgment;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.mentors.MentorsFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoreFragment extends BaseFragment {
    private View view;
    //private Button applyBtn;
    private View mentorsView;
    private View contact;
    private  View about_us;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_more,container,false);
        contact=view.findViewById(R.id.contact);
        about_us=view.findViewById(R.id.aboutUs);
        mentorsView=view.findViewById(R.id.mentorsViewn);
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
