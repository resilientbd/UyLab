package com.uysys.uylab.ui.classactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.Routine.RoutineActivity;

public class ClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
    }

    public void backToDashboard(View view) {
        finish();
    }

    public void goToRoutineActivity(View view) {
        Intent intent=new Intent(ClassActivity.this,RoutineActivity.class);
        startActivity(intent);
    }
}
