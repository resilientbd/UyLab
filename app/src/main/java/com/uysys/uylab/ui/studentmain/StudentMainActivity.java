package com.uysys.uylab.ui.studentmain;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.dashboard.DashboardFragment;
import com.uysys.uylab.ui.profile.ProfileFragment;

public class StudentMainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener,FragmentListener{
    FragmentManager manager;
    private DashboardFragment dashboardFragment;
    private ProfileFragment profileFragment;
    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main);

        dashboardFragment=new DashboardFragment();
        dashboardFragment.setListener(this);
        profileFragment=new ProfileFragment();
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
                manager.beginTransaction().replace(R.id.changelayout,dashboardFragment).commit();
                break;
            case R.id.menu_profile:
                manager.beginTransaction().replace(R.id.changelayout,profileFragment).commit();
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

    @Override
    public void onAddFragment(Fragment fragment) {
        manager.beginTransaction().replace(R.id.changelayout,fragment).commit();
    }

    @Override
    public void onBackFragment() {
       // manager.popBackStack();
    }
}
