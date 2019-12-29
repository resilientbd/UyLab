package com.uysys.uylab.ui.seminar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.uysys.uylab.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Seminar_Adapter_2 extends RecyclerView.Adapter<Seminar_Adapter_2.ViewHolder> {

    private Seminar_Adapter_2ClickLisener seminar_adapter_2ClickLisener;
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_seminar_recycler,null);
        ViewHolder viewHolder = new  ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
          seminar_adapter_2ClickLisener.onSeminarAdapterItemClick(position);
           }
       });
    }
    public void setOnSeminarAdapterItemClickListener(Seminar_Adapter_2ClickLisener seminar_adapter_2ClickLisener) {
        this.seminar_adapter_2ClickLisener = seminar_adapter_2ClickLisener;
    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public interface Seminar_Adapter_2ClickLisener {
        public void onSeminarAdapterItemClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            button= itemView.findViewById(R.id.joinBtn);
        }
    }
}
