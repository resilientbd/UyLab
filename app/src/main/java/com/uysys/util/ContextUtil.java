package com.uysys.util;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.uysys.uylab.ui.base.BaseActivity;

public class ContextUtil extends AppCompatActivity {
    public  Context getContext(){

        return getBaseContext();
    }
}
