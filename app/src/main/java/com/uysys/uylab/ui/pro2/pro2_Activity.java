package com.uysys.uylab.ui.pro2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.pro3.pro3_Activity;

public class pro2_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro2_);
        Intent intent =new Intent(pro2_Activity.this, pro3_Activity.class);
        startActivity(intent);
    }
}
