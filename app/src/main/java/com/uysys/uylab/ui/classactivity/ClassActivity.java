package com.uysys.uylab.ui.classactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.Routine.RoutineActivity;
import com.uysys.uylab.ui.classContent.Class_Content_Activity;

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

    public void gotToCLassContent(View view) {
        Intent intent=new Intent(ClassActivity.this, Class_Content_Activity.class);
        startActivity(intent);
    }
}
