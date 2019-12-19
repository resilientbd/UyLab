package com.uysys.uylab.ui.backupsubmit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.backup.BackupFragment;
import com.uysys.uylab.ui.base.BaseFragment;

public class BackupSubmitFragment extends BaseFragment {
    private View view;
    private Button closeBtn;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_backup_submit,container,false);
        closeBtn=view.findViewById(R.id.btnhome);
        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getFragmentListener()!=null)
                {
                    BackupFragment fragment=new BackupFragment();
                    fragment.setFragmentListener(getFragmentListener());
                    getFragmentListener().onAddFragment(fragment);
                }
            }
        });
        return view;
    }
}
