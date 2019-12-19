package com.uysys.uylab.ui.point;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;

public class Point_Fragment extends BaseFragment implements View.OnClickListener {
    private Adapter_Point adapter_point;
    private RecyclerView recyclerView;
    private View statusBtn;
    private View reedemBtn;
    private View pointBtn;

    View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_point, container, false);
        recyclerView = view.findViewById(R.id.points_recycler);
        adapter_point = new Adapter_Point();
        recyclerView.setAdapter(adapter_point);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        statusBtn = view.findViewById(R.id.statusbtn);
        reedemBtn = view.findViewById(R.id.reedembtn);
        pointBtn = view.findViewById(R.id.pointbtn);

        statusBtn.setOnClickListener(this);
        reedemBtn.setOnClickListener(this);
        pointBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        BaseFragment fragment=null;
        switch (v.getId()) {
            case R.id.statusbtn:
                fragment=new Point_Fragment();
                break;
            case R.id.reedembtn:
                fragment=new Point1_Fragment();
                break;
            case R.id.pointbtn:
                fragment=new Point1_Fragment();
                break;

            default:
                break;
        }

        if (getFragmentListener()!=null&&fragment!=null)
        {
            fragment.setFragmentListener(getFragmentListener());
            getFragmentListener().onAddFragment(fragment);
        }
    }
}
