package com.uysys.uylab.ui.classContent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.classContentVideoShower.Class_Content_Video_Shower_Activity;

public class Class_Content_Activity extends AppCompatActivity implements ClassContentAdapter.OnClassAdapterItemClickListener {
private RecyclerView mRecyclerView;
private TextView headerText;
private ClassContentAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class__content_);
        mRecyclerView=findViewById(R.id.recyclerView);
        headerText=findViewById(R.id.text5);
        headerText.setVisibility(View.GONE);
        mRecyclerView.setVisibility(View.GONE);
        mAdapter=new ClassContentAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.setListener(this);
    }

    public void SeeNow(View view) {
        visiblityControl();
    }

    private void visiblityControl()
    {
        if(headerText.getVisibility()==View.GONE)
        {
            headerText.setVisibility(View.VISIBLE);
            mRecyclerView.setVisibility(View.VISIBLE);
        }
        else {
            headerText.setVisibility(View.GONE);
            mRecyclerView.setVisibility(View.GONE);
        }
    }

    public void backToDashboard(View view) {
        finish();
    }


    @Override
    public void onClassAdapterItemClick(int position) {
        Intent intent=new Intent(Class_Content_Activity.this, Class_Content_Video_Shower_Activity.class);
        startActivity(intent);
    }
}
