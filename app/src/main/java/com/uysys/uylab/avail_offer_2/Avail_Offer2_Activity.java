package com.uysys.uylab.avail_offer_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.R;

public class Avail_Offer2_Activity extends AppCompatActivity {
    private Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.avail_offer_2 );

        btn1=findViewById ( R.id.homeBtn_avail_2 );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( Avail_Offer2_Activity.this,null );
            }
        } );
    }
}
