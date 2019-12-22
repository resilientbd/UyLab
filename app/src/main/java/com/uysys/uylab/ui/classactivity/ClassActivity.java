package com.uysys.uylab.ui.classactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.Routine.RoutineActivity;
import com.uysys.uylab.ui.classContent.Class_Content_Activity;
import com.uysys.uylab.ui.classmodule.ClassModule;
import com.uysys.uylab.ui.complain.ComplainActivity;

public class ClassActivity extends AppCompatActivity {

    private CardView cardView;

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

    public void goToClassModule(View view) {
        Intent intent=new Intent(ClassActivity.this, ClassModule.class);
        startActivity(intent);
    }
    public void goToClassComplain(View view) {
        Intent intent=new Intent(ClassActivity.this, ComplainActivity.class);
        startActivity(intent);
    }
}
