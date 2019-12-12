package com.uysys.uylab.ui.offer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.offer1.offer1_Activity;

public class OfferActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer);


        imageView = findViewById(R.id.imageView3);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Intent intent = new Intent(OfferActivity.this, offer1_Activity.class);
                 startActivity(intent);
                 finish();
            }
        });
    }
}