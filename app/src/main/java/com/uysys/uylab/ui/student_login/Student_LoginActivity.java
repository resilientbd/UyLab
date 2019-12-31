package com.uysys.uylab.ui.student_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.login.LoginModel;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.studentmain.StudentMainActivity;

import retrofit2.Call;

public class Student_LoginActivity extends AppCompatActivity implements RetrofitUtil.RetrofitUtilListener {
    private RemoteApiInterface minterface;
    private RetrofitUtil retrofitUtil;
    private EditText emailtext;
    private EditText edittext;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__login);

        minterface= RemoteApiProvider.getInstance().getRemoteApi();
        retrofitUtil=new RetrofitUtil();
       retrofitUtil.setRetrofitUtilListener(this);
       emailtext=findViewById(R.id.editText);
       edittext=findViewById(R.id.editText3);
    }

    public void loginStudent(View view) {
        String email=emailtext.getText().toString().trim();
        String password=edittext.getText().toString().trim();
        Call call=minterface.login(email,password,"1234");
        retrofitUtil.networkCall(call);
        //Intent intent=new Intent(Student_LoginActivity.this, StudentMainActivity.class);
        //startActivity(intent);
        //finish();
    }

    @Override
    public void onSuccess(Object object) {
        Log.d("chk","model"+object.toString());
      LoginModel login =(LoginModel) object;
      if(login.getCode()==200)
      {
          Intent intent=new Intent(Student_LoginActivity.this, StudentMainActivity.class);
          startActivity(intent);
          finish();
      }
      else
      {
          Toast.makeText(getBaseContext(),""+login.getMessages().get(0),Toast.LENGTH_SHORT).show();
      }

    }

    @Override
    public void onError(String message) {
        Log.d("chk",message);

    }
}
