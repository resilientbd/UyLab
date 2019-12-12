package com.uysys.uylab.save;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.internship.InternshipActivity;

public class SaveActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        btn = findViewById(R.id.go_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SaveActivity.this, InternshipActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
