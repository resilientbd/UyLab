package com.uysys.uylab.ui.notice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.model.notice.Datum;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.NoticeOldestItemRecyclerBinding;

import java.util.List;

public class NoticeOldestAdapter extends RecyclerView.Adapter<NoticeOldestAdapter.ViewHolder> {
    NoticeOldestItemRecyclerBinding noticeOldestBinding;
    List<Datum> datalist;

    public NoticeOldestAdapter(List<Datum> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        noticeOldestBinding= DataBindingUtil.inflate(inflater, R.layout.notice_oldest_item_recycler,parent,false);
        View view=noticeOldestBinding.getRoot();
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String string=datalist.get(position).getTitle() ;
        noticeOldestBinding.oldesttext.setText(string);

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
