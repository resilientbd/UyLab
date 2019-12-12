package com.uysys.uylab.ui.offer2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.pro2.pro2_Activity;

public class offer2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer2_);
        Intent intent =new Intent(offer2_Activity.this, pro2_Activity.class);
        startActivity(intent);
    }
}
