package com.uysys.uylab.ui.seminar;

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

public class Seminar_Fragment_2 extends BaseFragment implements Seminar_Adapter_2.Seminar_Adapter_2ClickLisener {
    private View view;
    private RecyclerView recyclerView;
    private Seminar_Adapter_2 seminar_adapter_2;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.seminar_fragment_2,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);
        seminar_adapter_2 = new Seminar_Adapter_2();
        recyclerView.setAdapter(seminar_adapter_2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        seminar_adapter_2.setOnSeminarAdapterItemClickListener(this);
        return view;
    }

    @Override
    public void onSeminarAdapterItemClick(int position) {
        if(getFragmentListener()!=null)
        {
            Seminar_Fragment_1 frag=new Seminar_Fragment_1();
            frag.setFragmentListener(getFragmentListener());
            getFragmentListener().onAddFragment(frag);
        }
    }
}
