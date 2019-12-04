package com.uysys.uylab.ui.pro3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.test_finished.test_finished_Activity;

public class pro3_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro3_);
        Intent intent =new Intent(pro3_Activity.this, test_finished_Activity.class);
        startActivity(intent);
    }
}
