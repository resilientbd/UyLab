package com.uysys.uylab.ui.open_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.student_login.Student_LoginActivity;
import com.uysys.uylab.ui.save.SaveActivity;

public class Open_PageActivity extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open__page);

        btn = findViewById(R.id.guest_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Open_PageActivity.this, Student_LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
