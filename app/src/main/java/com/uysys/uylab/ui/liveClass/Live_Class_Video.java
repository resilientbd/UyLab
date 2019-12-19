package com.uysys.uylab.ui.liveClass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Live_Class_Video extends BaseFragment implements Live_Video_Adapter.Live_Video_AdapterClickListener {

    private View view;
    private RecyclerView recyclerView;
    private Live_Video_Adapter live_video_adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_live_class_video,container,false);
        live_video_adapter = new Live_Video_Adapter();
        recyclerView=view.findViewById(R.id.recylerviewnew);
        recyclerView.setAdapter(live_video_adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager((getActivity())));
        live_video_adapter.setLive_video_adapterClickListener(this);

        return view;
    }

    @Override
    public void onLive_VideoItemClick(int position) {
        if(getFragmentListener()!=null)
        {
            Live_Class_Video frag=new Live_Class_Video();
            frag.setFragmentListener(getFragmentListener());
            getFragmentListener().onAddFragment(frag);
        }
    }
}
