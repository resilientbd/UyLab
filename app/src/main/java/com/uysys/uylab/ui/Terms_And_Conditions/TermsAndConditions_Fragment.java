package com.uysys.uylab.ui.Terms_And_Conditions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.classContent.ClassContentAdapter;
import com.uysys.uylab.ui.classContent.Class_Content_Activity;
import com.uysys.uylab.ui.classContentVideoShower.Class_Content_Video_Shower_Activity;

public class TermsAndConditions_Fragment extends AppCompatActivity implements FAQAdapter.OnClassAdapterItemClickListener {

    private RecyclerView mRecyclerView;
    private TextView headerText;
    private ClassContentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions__fragment);
        mRecyclerView=findViewById(R.id.recycleView);
        headerText=findViewById(R.id.faqHeader);

    }


    @Override
    public void onClassAdapterItemClick(int position) {

    }
}
