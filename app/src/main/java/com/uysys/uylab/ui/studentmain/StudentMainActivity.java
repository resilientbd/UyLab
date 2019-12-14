package com.uysys.uylab.ui.studentmain;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.dashboard.DashboardFragment;

public class StudentMainActivity extends AppCompatActivity {
    FragmentManager manager;
    private DashboardFragment dashboardFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main);

        dashboardFragment=new DashboardFragment();
        manager=getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.changelayout,dashboardFragment);
    }
}
