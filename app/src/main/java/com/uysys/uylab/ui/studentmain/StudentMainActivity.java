package com.uysys.uylab.ui.studentmain;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.dashboard.DashboardFragment;

public class StudentMainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    FragmentManager manager;
    private DashboardFragment dashboardFragment;
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main);

        dashboardFragment=new DashboardFragment();
        manager=getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.changelayout,dashboardFragment).commit();
        navigationView=findViewById(R.id.bottomNavigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.menu_home:
                manager.beginTransaction().replace(R.id.changelayout,dashboardFragment);
                break;
            case R.id.menu_profile:

                break;
            case R.id.menu_blog:
                break;
            case R.id.menu_referral:
                break;
            case R.id.menu_more:
                break;
        }
        return true;
    }
}
