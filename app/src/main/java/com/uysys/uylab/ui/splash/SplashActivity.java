package com.uysys.uylab.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.uysys.util.AppConstraints;
import com.uysys.util.SharedPrefUtil;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.open_page.Open_PageActivity;
import com.uysys.uylab.ui.student_login.Student_LoginActivity;
import com.uysys.uylab.ui.studentmain.StudentMainActivity;

public class SplashActivity extends AppCompatActivity {
    private class MyTimer extends CountDownTimer {

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public MyTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

        }

        @Override
        public void onFinish() {
            checkIfAlreadySignin();
        }
    }

    public void checkIfAlreadySignin()
    {
        String api_key= SharedPrefUtil.GET_PREFERENCE(SplashActivity.this, AppConstraints.AppCredential.API_TOKEN);
        if(api_key.isEmpty())
        {
            Intent intent = new Intent(SplashActivity.this, Open_PageActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Intent intent = new Intent(SplashActivity.this, StudentMainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        MyTimer timer = new MyTimer(2000, 500);
        timer.start();
    }
}
