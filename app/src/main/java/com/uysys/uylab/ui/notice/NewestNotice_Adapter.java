package com.uysys.uylab.ui.notice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.model.notice.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.NoticeNewestRecyclerBinding;

import java.util.List;

public class NewestNotice_Adapter extends RecyclerView.Adapter<NewestNotice_Adapter.ViewHolder> {
    private NoticeNewestRecyclerBinding binding;
    List<Datum> list;

    public NewestNotice_Adapter(List<Datum> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from ( parent.getContext () );
        binding= DataBindingUtil.inflate ( inflater,R.layout.notice_newest_recycler,parent,false );
        View view = binding.getRoot ();
        ViewHolder holder = new ViewHolder ( view );
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        binding.textView.setText ( list.get ( position ).getTitle ().toString () );
        binding.textView4.setText ( list.get ( position ).getDescription ().toString ());
        binding.textView5.setText ( list.get ( position ).getPublishedAt ().toString ());
    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super ( itemView );
        }
    }
}
