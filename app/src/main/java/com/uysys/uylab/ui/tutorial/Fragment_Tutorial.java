package com.uysys.uylab.ui.tutorial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Fragment_Tutorial  extends BaseFragment implements Tutorial_Popular_Adapter.Tutorial_Popular_AdapterClickLisiner {
    private View view;
    private RecyclerView recyclerView;
    private Tutorial_Popular_Adapter tutorial_popular_adapter;
    private Tutorial_Recent_Adapter tutorial_recent_adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tutorial,container,false);
        recyclerView =view.findViewById(R.id.recyclerView);
        tutorial_popular_adapter = new Tutorial_Popular_Adapter();
        recyclerView.setAdapter(tutorial_popular_adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView =view.findViewById(R.id.recyclerView1);
        tutorial_recent_adapter = new Tutorial_Recent_Adapter();
        recyclerView.setAdapter(tutorial_recent_adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
         tutorial_popular_adapter.setTutroial_Popular_adapterClickListener(this);
        return view;

    }


    @Override
    public void onLive_classItemClick(int position) {

            if(getFragmentListener()!=null)
            {
                Fragment_Tutorial_Video frag=new Fragment_Tutorial_Video();
                frag.setFragmentListener(getFragmentListener());
                getFragmentListener().onAddFragment(frag);
            }
        }
    }

