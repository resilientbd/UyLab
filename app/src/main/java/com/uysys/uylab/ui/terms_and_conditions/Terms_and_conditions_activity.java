package com.uysys.uylab.ui.terms_and_conditions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.uysys.uylab.R;

public class Terms_and_conditions_activity extends AppCompatActivity {

    private ImageView notification_icon;
    private TextView terms_and_condition_heading;
    private TextView terms_and_condition_title;
    private TextView terms_and_condition_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
        notification_icon=findViewById(R.id.notification_icon_id);
        terms_and_condition_heading=findViewById(R.id.text_terms_and_conditions_heading);
        terms_and_condition_title=findViewById(R.id.text_terms_and_condition_title);
        terms_and_condition_details=findViewById(R.id.text_erms_and_condition_details);
    }
}
