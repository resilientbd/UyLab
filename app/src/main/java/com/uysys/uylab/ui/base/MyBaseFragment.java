package com.uysys.uylab.ui.base;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.google.gson.Gson;
import com.uysys.util.AppConstraints;
import com.uysys.util.SharedPrefUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class MyBaseFragment extends BaseFragment {
    public abstract int setLayoutId();

    private ViewDataBinding viewDataBinding;

    public abstract void startUI();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewDataBinding = DataBindingUtil.inflate(inflater, setLayoutId(), container, false);
        startUI();
        return viewDataBinding.getRoot();
    }


    public ViewDataBinding getViewDataBinding() {
        return viewDataBinding;
    }

    //    public LoginResponse getUser(){
//        Gson gson=new Gson();
//        String userString= SharedPrefUtil.GET_PREFERENCE(getActivity(), AppConstraints.SavedCredentials.LOGIN_INFO);
//        if(!userString.isEmpty())
//            return gson.fromJson(userString,LoginResponse.class);
//        else return  null;
//    }
    public String getCurrentTime() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("DD-MM-yyyy HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        return formattedDate;
    }

    public void printCommonLog(String arg1, String arg2) {
        Log.d(AppConstraints.LogConstraints.COMMON_TAG, arg1 + ": " + arg2);
    }
}
