package com.uysys.uylab.ui.student_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.studentmain.StudentMainActivity;

public class Student_LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__login);
<<<<<<< HEAD
        mService= RemoteApiProvider.getInstance().getRemoteApi();
        mUtil=new RetrofitUtil();
        mUtil.setRetrofitUtilListener(this);

        emailText=findViewById(R.id.editText);
        passwordText=findViewById(R.id.editText3);
    }

    public void loginStudent(View view) {
        Intent intent=new Intent(Student_LoginActivity.this, StudentMainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onError(String message) {
        Log.d("chk",message);
=======
    }

    public void loginStudent(View view) {
        Intent intent=new Intent(Student_LoginActivity.this, StudentMainActivity.class);
        startActivity(intent);
        finish();
>>>>>>> remotes/origin/v5/yarhossain
    }
}
