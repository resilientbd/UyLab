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
import com.uysys.util.remote.model.profile_information.ProfileInformation;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;

import com.uysys.uylab.ui.studentmain.FragmentListener;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;

public class ProfileFragment extends Fragment implements RetrofitUtil.RetrofitUtilListener {
    private RetrofitUtil mUtil;
    private RemoteApiInterface mService;
    private View view;
    private Button btneditprofile;
    private FragmentManager manager;
    private EditProfileFragement editProfileFragement;
    private FragmentListener listener;
    private TextView usernameText;
    private TextView idText;
    private TextView pointText;
    private TextView rankText;
    private TextView personalPointText;
    private CircleImageView userImageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_profile, container, false);
        manager=getChildFragmentManager();
        btneditprofile=view.findViewById(R.id.editprofilebtn);
        btneditprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener!=null)
                {
                    listener.onAddFragment(new EditProfileFragement());
                }
            }
        });



        usernameText=view.findViewById(R.id.studentname);
        idText=view.findViewById(R.id.studentid);
        //pointText=view.findViewById(R.id.pointbtn);
        rankText=view.findViewById(R.id.globalrankbtn);
        personalPointText=view.findViewById(R.id.personalpoint);
        userImageView=view.findViewById(R.id.userImg);

        mService=RemoteApiProvider.getInstance().getRemoteApi();
        mUtil=new RetrofitUtil();
        mUtil.setRetrofitUtilListener(this);
        Call call=mService.proInfo();
        mUtil.networkCall(call);
        return view;

    }

    public void setListener(FragmentListener listener) {
        this.listener = listener;
    }

    @Override
    public void onSucces(Object object) {
        ProfileInformation information= (ProfileInformation) object;
        usernameText.setText(information.getData().getName());
        idText.setText(information.getData().getId());
      //  pointText.setText(information.getData().getPoint());
//        rankText.setText(information.getData().getRank());
//        personalPointText.setText(information.getData().getPoint());

        Glide.with(getActivity()).load(information.getData().getPhoto()).into(userImageView);
    }

    @Override
    public void onError(String message) {

    }
}
