package com.uysys.uylab.ui.student_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.login.Login;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.studentmain.StudentMainActivity;

import retrofit2.Call;

public class Student_LoginActivity extends AppCompatActivity implements RetrofitUtil.RetrofitUtilListener {
private RemoteApiInterface mService;
private RetrofitUtil mUtil;
private EditText emailText;
private EditText passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__login);
        mService= RemoteApiProvider.getInstance().getRemoteApi();
        mUtil=new RetrofitUtil();
        mUtil.setRetrofitUtilListener(this);

        emailText=findViewById(R.id.editText);
        passwordText=findViewById(R.id.editText3);
    }

    public void loginStudent(View view) {
        String email=emailText.getText().toString().trim();
        String password=passwordText.getText().toString().trim();
        Call call=mService.login(email,password,"123456");
        mUtil.networkcall(call);


    }




    @Override
    public void onSuccess(Object object) {
        Log.d("chk","model:"+object.toString());
        Login loginModel= (Login) object;
        if(loginModel.getCode()==200)
        {
            Intent intent=new Intent(Student_LoginActivity.this, StudentMainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(getBaseContext(),""+loginModel.getMessages().get(0),Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onError(String message) {
        Log.d("chk",message);
    }
}
