package com.uysys.uylab.ui.offer_4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.R;

public class Offer4_Activity extends AppCompatActivity {
    private Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.offer_4 );

        btn1=findViewById ( R.id.homeBtn_Offer4 );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( Offer4_Activity.this,null );
            }
        } );
    }
}
