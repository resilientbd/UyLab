package com.uysys.uylab.ui.ourPartner;

import android.os.Bundle;
import android.widget.TextView;

import com.uysys.uylab.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class OurPartnerActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private OfficialPartnerAdapter officialPartnerAdapter;
    private ConcernAdapter concernAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_partner);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView1 = findViewById(R.id.recyclerView1);
        officialPartnerAdapter=new OfficialPartnerAdapter();
        recyclerView.setAdapter(officialPartnerAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(OurPartnerActivity.this,3));

        concernAdapter =new ConcernAdapter();
        recyclerView1.setAdapter(concernAdapter);
        recyclerView1.setLayoutManager(new GridLayoutManager(OurPartnerActivity.this,3));
        //textView=null;
        //textView.setText(Html.fromHtml("<h1>SomeText</h1><span> Hello </span>"));

    }
}
