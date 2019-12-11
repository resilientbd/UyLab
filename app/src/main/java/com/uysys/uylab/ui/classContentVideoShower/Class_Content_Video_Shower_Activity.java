package com.uysys.uylab.ui.classContentVideoShower;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.uysys.uylab.R;

public class Class_Content_Video_Shower_Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Class_Content_VideoShower_Adapter class_content_videoShower_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class__content__video__shower);
        recyclerView =findViewById(R.id.recyclerView);
        class_content_videoShower_adapter = new Class_Content_VideoShower_Adapter();
        recyclerView.setAdapter(class_content_videoShower_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
