package com.uysys.uylab.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.contact.ContactFragment;
import com.uysys.uylab.ui.about_us.About_usFrgment;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.courses.Our_Courses_Fragment;
import com.uysys.uylab.ui.facilities.Facilities_Fragment;
import com.uysys.uylab.ui.gallery.GalleryFragment;
import com.uysys.uylab.ui.mentors.MentorsFragment;
import com.uysys.uylab.ui.ourPartner.Partner_Fragment;
import com.uysys.uylab.ui.seminar.Seminar_Fragment_2;
import com.uysys.uylab.ui.setting.Setting_Fragment;
import com.uysys.uylab.ui.success_story.Success_Story_Fragment_1;
import com.uysys.uylab.ui.term_conditions.Terms_and_Conditions_Fragment;
import com.uysys.uylab.ui.upcomming_batch.Upcomming_Batch_Fragment;

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
    private View upcommingBatch;
    private View aboutUsView;
    private View termsAndConditionView;
    private View ourCourseView;
    private View contactView;
    private View facilitesView;
    private View seminarView;
    private View successView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.more_fragment,container,false);
        contact=view.findViewById(R.id.contact);
        about_us=view.findViewById(R.id.aboutUs);
        mentorsView=view.findViewById(R.id.mentorsViewn);
        settingsView = view.findViewById(R.id.settingViewn);
        partnerView = view.findViewById(R.id.partnerViwen);
        coursesView=view.findViewById(R.id.course);
        galleryView=view.findViewById(R.id.gallerybtn);
        upcommingBatch = view.findViewById(R.id.upcomingBatchViewn);
        aboutUsView = view.findViewById(R.id.aboutUsViewn);
        termsAndConditionView = view.findViewById(R.id.termsAndConditionViewn);
        ourCourseView = view.findViewById(R.id.ourCourseViewn);
        contactView = view.findViewById(R.id.contactView);
         facilitesView = view.findViewById(R.id.facilitesViewn);
         seminarView = view.findViewById(R.id.seminarViewn);
         successView = view.findViewById(R.id.successViewn);

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
                 upcommingBatch.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         if(getFragmentListener()!=null){
                             Upcomming_Batch_Fragment upcomming_batch_fragment = new Upcomming_Batch_Fragment();
                             upcomming_batch_fragment.setFragmentListener(getFragmentListener());
                             getFragmentListener().onAddFragment(upcomming_batch_fragment);
                         }
                     }
                 });
                 aboutUsView.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         if(getFragmentListener()!=null){
                             About_usFrgment about_usFrgment= new About_usFrgment();
                             about_usFrgment.setFragmentListener(getFragmentListener());
                             getFragmentListener().onAddFragment(about_usFrgment);
                         }
                     }
                 });

                 termsAndConditionView.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         if(getFragmentListener()!=null){
                             Terms_and_Conditions_Fragment terms_and_conditions_fragment =new Terms_and_Conditions_Fragment();
                             terms_and_conditions_fragment.setFragmentListener(getFragmentListener());
                             getFragmentListener().onAddFragment(terms_and_conditions_fragment);
                         }
                     }
                 });
               ourCourseView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if(getFragmentListener()!=null){
                           Our_Courses_Fragment our_courses_fragment = new Our_Courses_Fragment();
                           our_courses_fragment.setFragmentListener(getFragmentListener());
                           getFragmentListener().onAddFragment(our_courses_fragment);
                       }
                   }
               });

               contactView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if (getFragmentListener()!=null){
                           ContactFragment contactFragment = new ContactFragment();
                           contactFragment.setFragmentListener(getFragmentListener());
                           getFragmentListener().onAddFragment(contactFragment);
                       }
                   }
               });
               facilitesView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       if (getFragmentListener()!=null){
                           Facilities_Fragment facilities_fragment = new Facilities_Fragment();
                           facilities_fragment.setFragmentListener(getFragmentListener());
                           getFragmentListener().onAddFragment(facilities_fragment);

                       }
                   }
               });
        seminarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getFragmentListener()!=null){
                    Seminar_Fragment_2 seminar_fragment_2 = new Seminar_Fragment_2();
                    seminar_fragment_2.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(seminar_fragment_2);

                }
            }
        });
        successView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getFragmentListener()!=null){
                    Success_Story_Fragment_1 success_story_fragment_1 = new Success_Story_Fragment_1();
                    success_story_fragment_1.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(success_story_fragment_1);

                }
            }
        });
        return view;


    }

}
