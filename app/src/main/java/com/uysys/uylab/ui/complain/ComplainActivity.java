package com.uysys.uylab.ui.complain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.complain__1.ComplainOneActivity;

public class ComplainActivity extends AppCompatActivity {
    private Button butSubmit;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain);

        butSubmit = (Button) findViewById(R.id.btnsubmit);



        //manager.beginTransaction().replace(R.id.changelayout,complainFragment).commit();

        butSubmit.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(ComplainActivity.this, ComplainOneActivity.class);
                    startActivity(intent);
                    finish();



                //Toast.makeText(ComplainActivity.this, "Cancel pressed", Toast.LENGTH_LONG).show();

            }
        });




    }
}
