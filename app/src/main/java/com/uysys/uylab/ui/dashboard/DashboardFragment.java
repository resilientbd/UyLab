package com.uysys.uylab.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.uysys.uylab.R;

import java.util.HashMap;

public class DashboardFragment  extends Fragment implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{
    private View view;
    private SliderLayout mDemoSlider;
    private PagerIndicator mPageIndicator;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_dashboard,container,false);
        mDemoSlider = view.findViewById(R.id.slider);
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

        return view;
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
}
