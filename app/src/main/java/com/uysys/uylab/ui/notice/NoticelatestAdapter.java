package com.uysys.uylab.ui.notice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.util.remote.model.notice.Datum;
import com.uysys.util.remote.model.notice.Notice;
import com.uysys.uylab.R;
import com.uysys.uylab.databinding.NoticeLatestItemRecyclerBinding;

import java.util.List;

public class NoticelatestAdapter extends RecyclerView.Adapter<NoticelatestAdapter.ViewHolder> {
    NoticeLatestItemRecyclerBinding noticelatestBinding;
    private List<Datum> dataList;

    public NoticelatestAdapter(List<Datum> datalist) {
        this.dataList=datalist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        noticelatestBinding= DataBindingUtil.inflate(inflater, R.layout.notice_latest_item_recycler,parent,false);
        View view=noticelatestBinding.getRoot();
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String string= dataList.get(position).getTitle();
        noticelatestBinding.latesttext.setText(string);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
