package com.uysys.uylab.ui.complain_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.R;

public class Complain1_Activity extends AppCompatActivity {
    private Button btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.complain_1 );

        btn1=findViewById ( R.id.backBtn_complain1 );

    }
}
