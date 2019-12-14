package com.uysys.uylab.ui.refferal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.uysys.uylab.R;

public class RefferalFragment extends Fragment {
    private View view;
    private Button withdraw;
    private FragmentManager manager;
    private RefferalWithdrawFragment refferalWithdrawFragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_refferal, container, false);
        withdraw=view.findViewById(R.id.balancebuttn);
        refferalWithdrawFragment=new RefferalWithdrawFragment();
        manager=getChildFragmentManager();
        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"hi",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
