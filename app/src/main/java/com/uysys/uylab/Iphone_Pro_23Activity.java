package com.uysys.uylab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Iphone_Pro_23Activity extends AppCompatActivity implements View.OnClickListener {

    public TextView facebok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone_pro_23);

        facebok = findViewById(R.id.TextFacebook);

        facebok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.TextFacebook){
            Intent intent = new Intent(this, Iphone_Pro_24Activity.class);
            startActivity(intent);
        }
    }
}
