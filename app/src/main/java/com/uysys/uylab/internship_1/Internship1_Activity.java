package com.uysys.uylab.internship_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.R;

public class Internship1_Activity extends AppCompatActivity {
    private Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.internship_1 );

        btn1=findViewById ( R.id.closeBtn_internship1 );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent ( Internship1_Activity.this,null );
            }
        } );
    }
}
