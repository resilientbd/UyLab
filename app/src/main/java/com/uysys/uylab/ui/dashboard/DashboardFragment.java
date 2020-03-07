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


import com.glide.slider.library.SliderLayout;
import com.glide.slider.library.indicators.PagerIndicator;
import com.glide.slider.library.slidertypes.BaseSliderView;
import com.glide.slider.library.slidertypes.TextSliderView;
import com.glide.slider.library.tricks.ViewPagerEx;
import com.google.android.material.navigation.NavigationView;
import com.squareup.picasso.Picasso;
import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.profile.ProfileModel;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.FragmentDashboardBinding;
import com.uysys.uylab.ui.backup.BackupFragment;
import com.uysys.uylab.ui.base.MyBaseFragment;
import com.uysys.uylab.ui.classContent.Class_Content_Activity;
import com.uysys.uylab.ui.classactivity.ClassActivity;
import com.uysys.uylab.ui.complain.ComplainActivity;
import com.uysys.uylab.ui.event.EventFragment;
import com.uysys.uylab.ui.internship.InternshipFragment;
import com.uysys.uylab.ui.job.JobFragment;
import com.uysys.uylab.ui.jobapply.JobapplyFragment;
import com.uysys.uylab.ui.jobopen.JobopenFragment;
import com.uysys.uylab.ui.liveClass.Live_Class;
import com.uysys.uylab.ui.notice.NoticeFragment;
import com.uysys.uylab.ui.payment_summery.PaymentSummeryFragment;
import com.uysys.uylab.ui.point.Point1_Fragment;
import com.uysys.uylab.ui.point.Point_Fragment;
import com.uysys.uylab.ui.studentmain.FragmentListener;
import com.uysys.uylab.ui.support.SupportFragment;
import com.uysys.uylab.ui.tutorial.Fragment_Tutorial;

import java.util.HashMap;

import retrofit2.Call;

public class DashboardFragment  extends MyBaseFragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener, View.OnClickListener, RetrofitUtil.RetrofitUtilListener {
    private View view;
    private SliderLayout mDemoSlider;
    private PagerIndicator mPageIndicator;
    private NavigationView navigationView;
    private FragmentListener listener;
    private CardView noticeView;
    private CardView classView;
    private CardView internshipView;
    //private CardView contestView;
    private View backupBtn;
    private View supportBtn;
    private View eventBtn;
    private View liveClassBtn;
    private View jobhubButton;
    private View pointbtn;
    private View tutorialbtn;
    private View detailsBtn;

    private InternshipFragment internshipFragment;
    private BackupFragment backupFragment;
    private SupportFragment supportFragment;
    private JobFragment jobFragment;
    private Fragment_Tutorial fragmentTutorial;
    private JobopenFragment jobopenFragment;
    private JobapplyFragment jobapplyFragment;

    private EventFragment eventFragment;
    private Live_Class live_class;
    private Point_Fragment point_fragment;
    private Point1_Fragment point1_fragment;
    private PaymentSummeryFragment paymentSummeryFragment;
    private RetrofitUtil mUtil;
    private RemoteApiInterface mService;
    private FragmentDashboardBinding mBinding;
    @Override
    public int setLayoutId() {
        return R.layout.fragment_dashboard;
    }

    @Override
    public void startUI() {
        mBinding= (FragmentDashboardBinding) getViewDataBinding();
        mDemoSlider = mBinding.slider;
        noticeView=mBinding.notice;
        mService= RemoteApiProvider.getInstance(getActivity()).getRemoteApi();
        //for contestView
        //contestView = view.findViewById(R.id.contestView);

        classView=mBinding.classview;
        internshipView=mBinding.internshipclick;
        backupBtn=mBinding.backupbtn;
        supportBtn=mBinding.supportBtn;
        eventBtn=mBinding.eventcardbutton;
        liveClassBtn = mBinding.liveClassBtn;
        jobhubButton = mBinding.jobhubbtn;
        detailsBtn = mBinding.detailsview;

        supportBtn.setOnClickListener(this);
        eventBtn.setOnClickListener(this);
        liveClassBtn.setOnClickListener(this);
        pointbtn=mBinding.pointbtn;
        pointbtn.setOnClickListener(this);
        jobhubButton.setOnClickListener(this);
        tutorialbtn=mBinding.tutorialbtn;
        tutorialbtn.setOnClickListener(this);
        detailsBtn.setOnClickListener(this);

        //  mPageIndicator=view.findViewById(R.id.custom_indicator);

        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Hannibal",R.drawable.bannersample1);
        file_maps.put("Big Bang Theory",R.drawable.bannersample1);
        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView

                    .image(file_maps.get(name))

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
        //contestView.setOnClickListener(this);
        internshipView.setOnClickListener(this);
        backupBtn.setOnClickListener(this);
        mUtil=new RetrofitUtil();
        Call call=mService.profile();
        mUtil.setRetrofitUtilListener(this);
        mUtil.networkcall(call);

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
        jobFragment=new JobFragment();
        jobFragment.setFragmentListener(listener);
        point_fragment = new Point_Fragment();
        point_fragment.setFragmentListener(listener);
        fragmentTutorial=new Fragment_Tutorial();
        fragmentTutorial.setFragmentListener(listener);
        point1_fragment = new Point1_Fragment();
        point1_fragment.setFragmentListener(listener);
        paymentSummeryFragment=new PaymentSummeryFragment();
        paymentSummeryFragment.setFragmentListener(listener);


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

//
//            case R.id.contestView:
//                intent=new Intent(getActivity(), ComplainActivity.class);
//                startActivity(intent);
//                break;

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
            case R.id.jobhubbtn:
                addFragment(jobFragment);
                break;
            case R.id.pointbtn:
                addFragment(point_fragment);
                break;
            case R.id.point1btn:
                addFragment(point1_fragment);
                break;
            case R.id.tutorialbtn:
                addFragment(fragmentTutorial);
                break;
            case R.id.detailsview:
                addFragment(paymentSummeryFragment);

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

    @Override
    public void onSuccess(Object object) {
        if(object instanceof ProfileModel)
        {
            ProfileModel model= (ProfileModel) object;
            mBinding.textView.setText(model.getData().getName());
            mBinding.idtext.setText(model.getData().getId());
            mBinding.paidamount.setText(""+model.getData().getPoint());

            Picasso.with(getActivity()).load(model.getData().getPhoto()).error(R.drawable.default_img).into(mBinding.imageView3);

        }
    }

    @Override
    public void onError(String messege) {

    }
}
