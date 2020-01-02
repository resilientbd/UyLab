package com.uysys.uylab.ui.internship;

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
import com.uysys.uylab.ui.internship_1.Internship1_Activity;
import com.uysys.uylab.ui.internship_1.Internship1_Fragment;
import com.uysys.uylab.ui.studentmain.FragmentListener;

public class InternshipFragment extends Fragment {

    private Button btn;
    private View view;
    private FragmentListener fragmentListener;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_internship,container,false);
                btn = view.findViewById(R.id.apply_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(fragmentListener!=null)
                {
                    Internship1_Fragment internship1_fragment=new Internship1_Fragment();
                    internship1_fragment.setListener(fragmentListener);
                    fragmentListener.onAddFragment(internship1_fragment);
                }

            }
        });
        return view;
    }

    public void setFragmentListener(FragmentListener fragmentListener) {
        this.fragmentListener = fragmentListener;
    }
    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_internship);
//
//        btn = findViewById(R.id.apply_button);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(InternshipFragment.this, Internship1_Activity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//    }
}
