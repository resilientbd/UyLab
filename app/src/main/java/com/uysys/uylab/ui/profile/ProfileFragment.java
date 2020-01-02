package com.uysys.uylab.ui.profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.profile.ProfileModel;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;

import com.uysys.uylab.ui.studentmain.FragmentListener;

import retrofit2.Call;

public class ProfileFragment extends Fragment implements RetrofitUtil.RetrofitUtilListener {

    private View view;
    private Button btneditprofile;
    private FragmentManager manager;
    private EditProfileFragement editProfileFragement;
    private FragmentListener listener;
    private RemoteApiInterface minService;
    private RetrofitUtil mUtil;
    private TextView userName;
    private  TextView userId;
    private TextView pointText;
    private TextView bankText;
    private TextView rankText;
    private ImageView imageView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_profile, container, false);
        manager = getChildFragmentManager();
        btneditprofile = view.findViewById(R.id.editprofilebtn);
        btneditprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onAddFragment(new EditProfileFragement());
                }
            }
        });

        userName = view.findViewById(R.id.studentname);
        userId = view.findViewById(R.id.studentid);
        pointText = view.findViewById(R.id.pointbtn);
        bankText = view.findViewById(R.id.globalrankbtn);
        rankText = view.findViewById(R.id.personalpoint);
        imageView = view.findViewById(R.id.userImg);
        minService = RemoteApiProvider.getInstance().getRemoteApi();
        mUtil = new RetrofitUtil();
        mUtil.setRetrofitUtilListener(this);
        Call call=minService.profile();
        mUtil.networkcall(call);
        return view;

    }

    public void setListener(FragmentListener listener) {
        this.listener = listener;
    }

    @Override
    public void onSuccess(Object object) {
        ProfileModel profileModel= (ProfileModel) object;
        userName.setText(profileModel.getData().getName());
        userId.setText(profileModel.getData().getId());
        //pointText.setText(profileModel.getData().getPoint());
        //bankText.setText(profileModel.getData().getPoint());
        //rankText=view.findViewById(R.id.rank);


        Glide.with(getActivity()).load(profileModel.getData().getPhoto()).into(imageView);
    }

    @Override
    public void onError(String message) {

    }
}
