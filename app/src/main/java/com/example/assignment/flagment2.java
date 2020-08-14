package com.example.assignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.assignment.Adapter.PagerAdapter1;
import com.google.android.material.tabs.TabLayout;

public class flagment2 extends Fragment {
    public flagment2() {
    }
    private View rootview;
    TabLayout tl;
    PagerAdapter1 paperadapter;
    ViewPager paper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.flagment2,container,false);
        initView();
        return  rootview;
    }
    private void initView(){
        paperadapter = new PagerAdapter1(getActivity().getSupportFragmentManager());
        tl = rootview.findViewById(R.id.tab_layout1);
        paper = rootview.findViewById(R.id.view_paper1);
        paper.setAdapter(paperadapter);
        tl.setupWithViewPager(paper);
    }
}
