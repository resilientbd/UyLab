package com.uysys.uylab.ui.internship_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.studentmain.FragmentListener;

public class Internship1_Fragment extends Fragment {
    private Button btn1;
    private FragmentListener listener;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.internship_1,container,false);
                btn1=view.findViewById ( R.id.closeBtn_internship1 );
        btn1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
               if(listener!=null)
               {
                   listener.onBackFragment();
               }
            }
        } );
        return view;
    }
    //    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate ( savedInstanceState );
//        setContentView ( R.layout.internship_1 );
//
//        btn1=findViewById ( R.id.closeBtn_internship1 );
//        btn1.setOnClickListener ( new View.OnClickListener () {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent ( Internship1_Fragment.this,null );
//            }
//        } );
//    }

    public void setListener(FragmentListener listener) {
        this.listener = listener;
    }
}
