package com.uysys.uylab.ui.classContentShower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.uysys.uylab.R;

public class Class_Content_Shower_Activity extends AppCompatActivity {

    private ClassContentShowerAdapter classContentShowerAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class__content_shower);
        recyclerView = findViewById(R.id.recyclerView);
        classContentShowerAdapter =new ClassContentShowerAdapter();
        recyclerView.setAdapter(classContentShowerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
