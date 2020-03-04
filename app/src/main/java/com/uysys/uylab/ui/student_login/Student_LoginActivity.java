package com.uysys.uylab.ui.student_login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.uysys.util.AppConstraints;
import com.uysys.util.SharedPrefUtil;
import com.uysys.util.remote.RetrofitUtil;
import com.uysys.util.remote.model.login.Login;
import com.uysys.util.remote.retrofit.RemoteApiInterface;
import com.uysys.util.remote.retrofit.RemoteApiProvider;
import com.uysys.uylab.R;
import com.uysys.uylab.ui.studentmain.StudentMainActivity;

import retrofit2.Call;

import static com.uysys.util.AppConstraints.AppCredential.FIREBASE_TOKEN;

public class Student_LoginActivity extends AppCompatActivity implements RetrofitUtil.RetrofitUtilListener {
private RemoteApiInterface mService;
private RetrofitUtil mUtil;
private EditText emailText;
private EditText passwordText;
private String firebase_token;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__login);
        mService= RemoteApiProvider.getInstance(Student_LoginActivity.this).getRemoteApi();
        mUtil=new RetrofitUtil();
        mUtil.setRetrofitUtilListener(this);

        emailText=findViewById(R.id.editText);
        passwordText=findViewById(R.id.editText3);
        getFirebaseToken();
    }

    public void loginStudent(View view) {
        String email=emailText.getText().toString().trim();
        String password=passwordText.getText().toString().trim();
        Call call=mService.login(email,password,firebase_token);
        mUtil.networkcall(call);


    }

    @Override
    public void onSuccess(Object object) {
        Log.d("chk","model:"+object.toString());
        Login loginModel= (Login) object;

        if(loginModel.getCode()==200)
        {
            SharedPrefUtil.ADD_PREFERENCE(Student_LoginActivity.this,FIREBASE_TOKEN,firebase_token);
            SharedPrefUtil.ADD_PREFERENCE(Student_LoginActivity.this,AppConstraints.AppCredential.API_TOKEN,loginModel.getData());


            Intent intent=new Intent(Student_LoginActivity.this, StudentMainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(getBaseContext(),""+loginModel.getMessages().get(0),Toast.LENGTH_SHORT).show();
        }
    }
    public void getFirebaseToken()
    {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
            @Override
            public void onComplete(@NonNull Task<InstanceIdResult> task) {
                if (!task.isSuccessful()) {
                    Log.w("chk", "getInstanceId failed", task.getException());
                    return;
                }

                // Get new Instance ID token
                String token = task.getResult().getToken();


                firebase_token=token;
                Log.d("chk","firebasetoken:"+token);
                // Toast.makeText(HomeActivity.this, msg, Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onError(String message) {
        Log.d("chk",message);
    }
}
