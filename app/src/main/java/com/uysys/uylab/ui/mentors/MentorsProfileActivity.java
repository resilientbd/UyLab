package com.uysys.uylab.ui.mentors;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
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

        Picasso.with(getActivity()).load(datum.getPhoto()).error(R.drawable.default_img).into(mBinding.profileImage);

        mBinding.namtext.setText(datum.getName());
        mBinding.designationtext.setText(datum.getDesignation());
        mBinding.biotext.setText(datum.getBio());
        mBinding.fbbtn.setOnClickListener(v -> {
            openLink(datum.getSocialProfile().getFacebookProfileUrl());

        });
        mBinding.twitterbtn.setOnClickListener(v -> {
            openLink(datum.getSocialProfile().getTwitterProfileUrl());
        });
        mBinding.linkedinbtn.setOnClickListener(v -> {
            openLink(datum.getSocialProfile().getLinkedinProfileUrl());
        });

    }
    private void openLink(String link)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(browserIntent);
    }

}
