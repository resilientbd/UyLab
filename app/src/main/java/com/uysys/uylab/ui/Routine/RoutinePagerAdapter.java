package com.uysys.uylab.ui.Routine;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.uysys.util.remote.model.classroutine.Datum;

import java.util.ArrayList;
import java.util.List;

public class RoutinePagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList=new ArrayList<>();
    public RoutinePagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public void addItem(Datum classRoutine)
    {
        checkIfNull();
        RoutinePagerFragment fragment=new RoutinePagerFragment(classRoutine);
        fragmentList.add(fragment);
        notifyDataSetChanged();
    }
    public void addItems(List<Datum> classRoutines)
    {
        checkIfNull();
        for(Datum datum:classRoutines)
        {
            RoutinePagerFragment fr=new RoutinePagerFragment(datum);
            fragmentList.add(fr);
        }
        fragmentList.addAll(fragmentList);
        notifyDataSetChanged();
    }
    public void clear()
    {
        checkIfNull();
        fragmentList.clear();
        notifyDataSetChanged();
    }
    private void checkIfNull()
    {
        if(fragmentList==null)
        {
            fragmentList=new ArrayList<>();
        }
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
