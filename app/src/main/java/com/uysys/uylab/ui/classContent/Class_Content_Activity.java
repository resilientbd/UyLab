package com.uysys.uylab.ui.classContent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.classContentShower.Class_Content_Shower_Activity;

public class Class_Content_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class__content_);
    }

    public void SeeNow(View view) {
        Intent intent =new Intent(Class_Content_Activity.this, Class_Content_Shower_Activity.class);
        startActivity(intent);
        finish();
    }

    public void backToDashboard(View view) {
        finish();
    }


}
