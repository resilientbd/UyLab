package com.uysys.uylab.ui.backup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.backupsubmit.BackupSubmitFragment;
import com.uysys.uylab.ui.base.BaseFragment;

public class BackupFragment extends BaseFragment {
    private View view;
    private Button applyBtn;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_backup,container,false);
        applyBtn=view.findViewById(R.id.btnhome);
        applyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    BackupSubmitFragment fragment=new BackupSubmitFragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });
        return view;
    }
}
