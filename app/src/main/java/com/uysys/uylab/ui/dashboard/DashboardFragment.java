package com.uysys.uylab.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.google.android.material.navigation.NavigationView;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.backup.BackupFragment;
import com.uysys.uylab.ui.classContent.Class_Content_Activity;
import com.uysys.uylab.ui.classactivity.ClassActivity;
import com.uysys.uylab.ui.event.EventFragment;
import com.uysys.uylab.ui.internship.InternshipFragment;
import com.uysys.uylab.ui.liveClass.Live_Class;
import com.uysys.uylab.ui.notice.NoticeFragment;
import com.uysys.uylab.ui.studentmain.FragmentListener;
import com.uysys.uylab.ui.support.SupportFragment;

import java.util.HashMap;

public class DashboardFragment  extends Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener, View.OnClickListener {
    private View view;
    private SliderLayout mDemoSlider;
    private PagerIndicator mPageIndicator;
    private NavigationView navigationView;
    private FragmentListener listener;
    private CardView noticeView;
    private CardView classView;
    private CardView internshipView;
    private View backupBtn;
    private View supportBtn;
    private View eventBtn;
    private View liveClassBtn;
    private InternshipFragment internshipFragment;
    private BackupFragment backupFragment;
    private SupportFragment supportFragment;
    private EventFragment eventFragment;
    private Live_Class live_class;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_dashboard,container,false);
        mDemoSlider = view.findViewById(R.id.slider);
        noticeView=view.findViewById(R.id.notice);
        classView=view.findViewById(R.id.classview);
        internshipView=view.findViewById(R.id.internshipclick);
        backupBtn=view.findViewById(R.id.backupbtn);
        supportBtn=view.findViewById(R.id.supportBtn);
        eventBtn=view.findViewById(R.id.eventcardbutton);
        liveClassBtn = view.findViewById(R.id.liveClassBtn);
        supportBtn.setOnClickListener(this);
        eventBtn.setOnClickListener(this);
        liveClassBtn.setOnClickListener(this);

      //  mPageIndicator=view.findViewById(R.id.custom_indicator);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Hannibal",R.drawable.bannersample1);
        file_maps.put("Big Bang Theory",R.drawable.bannersample1);
        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView

                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
//        mDemoSlider.setCustomIndicator(mPageIndicator);
        classView.setOnClickListener(this);
        noticeView.setOnClickListener(this);
        internshipView.setOnClickListener(this);
        backupBtn.setOnClickListener(this);
        return view;
    }

    public void setListener(FragmentListener listener) {
        this.listener = listener;
        internshipFragment=new InternshipFragment();
        internshipFragment.setFragmentListener(listener);
        backupFragment= new BackupFragment();
        supportFragment=new SupportFragment();
        supportFragment.setFragmentListener(listener);
        backupFragment.setFragmentListener(listener);
        eventFragment=new EventFragment();
        eventFragment.setFragmentListener(listener);
        live_class=new Live_Class();
        live_class.setFragmentListener(listener);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.notice:
                addFragment(new NoticeFragment());
                break;
            case R.id.classview:
                 intent=new Intent(getActivity(), ClassActivity.class);
                startActivity(intent);
                break;
            case R.id.internshipclick:
              addFragment(internshipFragment);
                break;
            case R.id.backupbtn:
                addFragment(backupFragment);
                break;
            case R.id.supportBtn:
                addFragment(supportFragment);
                break;
            case R.id.eventcardbutton:
                addFragment(eventFragment);
                break;
            case R.id.liveClassBtn:
                addFragment(live_class);
                break;
            default:break;
        }
    }

    public void addFragment(Fragment fragment)
    {
        if(listener!=null)
        {
            listener.onAddFragment(fragment);
        }
    }
    public void removeFragment()
    {
        if(listener!=null)
        {
            listener.onBackFragment();
        }
    }

}
