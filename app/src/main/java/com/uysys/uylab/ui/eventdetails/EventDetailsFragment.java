package com.uysys.uylab.ui.eventdetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.eventjoin.EventJoinFragment;
import com.uysys.uylab.ui.eventsubmit.EventSubmitFragment;

public class EventDetailsFragment extends BaseFragment {
    private View view;
    private Button seminarjoinbtn;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_event_details,container,false);
        seminarjoinbtn=view.findViewById(R.id.btnjoinseminar);
        seminarjoinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    EventSubmitFragment fragment=new EventSubmitFragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });
        return view;
    }
}
