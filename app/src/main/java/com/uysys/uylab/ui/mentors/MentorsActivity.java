package com.uysys.uylab.ui.mentors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.ourPartner.OurPartnerActivity;

public class MentorsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MentorsAdapter mentorsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentors);
        recyclerView =findViewById(R.id.recyclerView);
        mentorsAdapter = new MentorsAdapter();
        recyclerView.setAdapter(mentorsAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(MentorsActivity.this,2));
    }
}
