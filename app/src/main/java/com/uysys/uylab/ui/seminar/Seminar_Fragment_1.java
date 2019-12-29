package com.uysys.uylab.ui.seminar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Seminar_Fragment_1 extends BaseFragment {
    private View view;
    private RecyclerView recyclerView;
    private Seminar_Adapter_1 seminar_adapter_1;
    private Button btn;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.seminar_fragment_1,container,false);
        recyclerView = view.findViewById(R.id.recyclerView);
        seminar_adapter_1 = new Seminar_Adapter_1();
        recyclerView.setAdapter(seminar_adapter_1);
        btn =  view.findViewById(R.id.submitBtn);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getFragmentListener()!=null){
                    Seminar_Fragment_3 seminar_fragment_3= new Seminar_Fragment_3();
                    seminar_fragment_3.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(seminar_fragment_3);
                }
            }
        });
        return view;
    }

}
