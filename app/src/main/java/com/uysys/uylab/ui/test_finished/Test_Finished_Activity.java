package com.uysys.uylab.ui.test_finished;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.pointearn.Pro_5Activity;

public class Test_Finished_Activity extends AppCompatActivity {

    private Button finished_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test__finished_);
        finished_btn = findViewById(R.id.button4);
        finished_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Test_Finished_Activity.this, Pro_5Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
