package com.uysys.uylab.ui.complain__1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.classactivity.ClassActivity;

public class ComplainOneActivity extends AppCompatActivity {
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_one);
        btnBack = (Button) findViewById(R.id.backBtn_complain1);


        btnBack.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(ComplainOneActivity.this, ClassActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
