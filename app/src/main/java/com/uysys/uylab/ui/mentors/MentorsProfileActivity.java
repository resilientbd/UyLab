package com.uysys.uylab.ui.mentors;

import android.os.Bundle;

import com.google.gson.Gson;
import com.uysys.util.AppConstraints;
import com.uysys.util.remote.model.mentor_profile.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ActivityMentorsProfileBinding;
import com.uysys.uylab.ui.base.BaseActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MentorsProfileActivity extends BaseActivity {
ActivityMentorsProfileBinding mBinding;
    @Override
    public int setLayoutId() {
        return R.layout.activity_mentors_profile;
    }

    @Override
    public void startUI() {
        mBinding= (ActivityMentorsProfileBinding) getViewDataBinding();
        String object=getIntent().getStringExtra(AppConstraints.IntentConstrants.Data);
        Gson gson=new Gson();

        Datum datum=gson.fromJson(object,Datum.class);

    }

}
