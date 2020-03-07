package com.uysys.uylab.ui.open_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.uysys.uylab.R;
import com.uysys.uylab.databinding.ActivityOpenPageBinding;
import com.uysys.uylab.ui.base.BaseActivity;
import com.uysys.uylab.ui.student_login.Student_LoginActivity;

public class Open_PageActivity extends BaseActivity {
    private Button btn;
    ActivityOpenPageBinding mBinding;
    @Override
    public int setLayoutId() {
        return R.layout.activity_open__page;
    }

    @Override
    public void startUI() {
        mBinding= (ActivityOpenPageBinding) getViewDataBinding();
        btn = mBinding.guestButton;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toaster.ShowLong("module is under development !");
//                Intent intent = new Intent(Open_PageActivity.this, Student_LoginActivity.class);
//                startActivity(intent);
//                finish();


            }
        });
    }



    public void studentClick(View view) {
        Intent intent = new Intent(Open_PageActivity.this, Student_LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
