package com.uysys.uylab.ui.Routine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.test_finished.Test_Finished_Activity;

public class RoutineActivity extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        text = findViewById(R.id.textView18);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RoutineActivity.this, Test_Finished_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
