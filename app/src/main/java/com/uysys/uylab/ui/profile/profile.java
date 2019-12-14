package com.uysys.uylab.ui.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.uysys.uylab.R;
import com.uysys.uylab.ui.profile1.Profile1Activity;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void GoToEditProfile(View view) {
        startActivity(new Intent(this, Profile1Activity.class));
    }
}
