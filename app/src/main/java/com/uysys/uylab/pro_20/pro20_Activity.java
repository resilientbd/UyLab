package com.uysys.uylab.pro_20;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.R;

public class pro20_Activity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.pro_20 );

        btn1=findViewById ( R.id.btnOurLab );
        btn2=findViewById ( R.id.btnFarewell );
        btn3=findViewById ( R.id.btnEvent );

        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( pro20_Activity.this,null );
            }
        } );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( pro20_Activity.this,null );
            }
        } );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( pro20_Activity.this,null );
            }
        } );
    }
}
