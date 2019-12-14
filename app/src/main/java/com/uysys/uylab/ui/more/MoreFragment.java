package com.uysys.uylab.ui.more;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.backupsubmit.BackupSubmitFragment;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.mentors.MentorsFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MoreFragment extends BaseFragment {
    private View view;
    //private Button applyBtn;
    private View mentorsView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_more,container,false);
        mentorsView=view.findViewById(R.id.mentorsViewn);
        //applyBtn=view.findViewById(R.id.button10);
//        applyBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(getFragmentListener()!=null)
//                {
//                    BackupSubmitFragment fragment=new BackupSubmitFragment();
//                    fragment.setFragmentListener(getFragmentListener());
//                    getFragmentListener().onAddFragment(fragment);
//                }
//            }
//        });
        mentorsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    MentorsFragment fragment=new MentorsFragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });
        return view;
    }
}
