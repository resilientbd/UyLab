package com.uysys.uylab.ui.event;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.uysys.uylab.R;
import com.uysys.uylab.ui.adapter.BlogLDownDetailsAdapter;
import com.uysys.uylab.ui.adapter.BlogLableAdapter;
import com.uysys.uylab.ui.base.BaseFragment;
import com.uysys.uylab.ui.eventdetails.EventDetailsFragment;
import com.uysys.uylab.ui.model.BlogDownDetailsModel;
import com.uysys.uylab.ui.model.BlogLabelModel;

import java.util.ArrayList;
import java.util.List;

public class EventFragment extends BaseFragment implements EventLableAdapter.EventLabelAdapterItemClickListener {
    private View view;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List dataset, dataset1;
    EventLableAdapter adapter;
    EventLableAdapter blogLDownDetailsAdapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_event, container, false);
        init();
        blogdowninit();
        return view;
    }

    void init() {
        recyclerView = (RecyclerView) view.findViewById(R.id.labelrecycleview);
        mLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        dataset = new ArrayList();
//        BlogLabelModel blogLabelModel = new BlogLabelModel(R.drawable.imagesample1, R.drawable.imagesample1, R.drawable.ic_clock, R.string.texttitle, "Young Hou", "1 sec ago");
//        dataset.add(blogLabelModel);
//        BlogLabelModel blogLabelModel1 = new BlogLabelModel(R.drawable.imagesample1, R.drawable.imagesample1, R.drawable.ic_clock, R.string.texttitle, "Young Hou", "1 sec ago");
//        dataset.add(blogLabelModel1);
        adapter = new EventLableAdapter(getActivity().getBaseContext(), dataset);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(mLayoutManager);
        adapter.notifyDataSetChanged();
        adapter.setItemClickListener(this);

    }

    void blogdowninit() {
        recyclerView = (RecyclerView) view.findViewById(R.id.downrecycleview);
        mLayoutManager = new LinearLayoutManager(getActivity());
        dataset1 = new ArrayList();
        BlogDownDetailsModel blogDownDetailsModel = new BlogDownDetailsModel(R.drawable.detailed1, R.drawable.ic_clock_blog_ash, R.drawable.ic_like, R.string.design_text_blog, R.string.design_detail_text, "1 sec ago", "885");
        dataset1.add(blogDownDetailsModel);
        BlogDownDetailsModel blogDownDetailsModel1 = new BlogDownDetailsModel(R.drawable.detailed1, R.drawable.ic_clock_blog_ash, R.drawable.ic_like, R.string.design_text_blog, R.string.design_detail_text, "1 sec ago", "885");
        dataset1.add(blogDownDetailsModel1);
        blogLDownDetailsAdapter = new EventLableAdapter(getActivity().getBaseContext(), dataset1);
        recyclerView.setAdapter(blogLDownDetailsAdapter);
        recyclerView.setLayoutManager(mLayoutManager);
        blogLDownDetailsAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(int position) {
        if(getFragmentListener()!=null)
        {
            EventDetailsFragment fragment=new EventDetailsFragment();
            fragment.setFragmentListener(getFragmentListener());
            getFragmentListener().onAddFragment(fragment);
        }
    }
}
