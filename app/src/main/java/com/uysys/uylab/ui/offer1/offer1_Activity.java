package com.uysys.uylab.ui.offer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.offer2.offer2_Activity;

public class offer1_Activity extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer1_);

        btn = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent =new Intent(offer1_Activity.this, offer2_Activity.class);
                startActivity(intent);
                finish();


            }
        });

    }
}
