package com.uysys.uylab.ui.success_story;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.liveClass.Live_Class_Video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Success_Story_Fragment_1 extends BaseFragment implements Success_Story1_Adapter.Success_Story1_AdapterClickLisener {
    private  View view;
    private RecyclerView recyclerView;
    private Success_Story1_Adapter success_story1_adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.success_story_1,container,false);
       recyclerView = view.findViewById(R.id.recyclerView);
       success_story1_adapter = new Success_Story1_Adapter();
       recyclerView.setAdapter(success_story1_adapter);
       recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        success_story1_adapter.setSuccess_story1_adapterClickLisener(this);
        return view;
    }

    @Override
    public void onSuccess_storyItemClick(int position) {
        if(getFragmentListener()!=null)
        {
            Success_Story_Fragment_2 frag=new Success_Story_Fragment_2();
            frag.setFragmentListener(getFragmentListener());
            getFragmentListener().onAddFragment(frag);
        }
    }
}
