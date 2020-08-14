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
import com.example.assignment.Adapter.PagerAdapter2;
import com.google.android.material.tabs.TabLayout;

public class flagment3 extends Fragment {
    public flagment3() {
    }
    private View rootview;
    ViewPager pager;
    TabLayout tl;
    PagerAdapter2 adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.flagment3,container,false);
        initView();
        return  rootview;
    }
    private void initView(){
        adapter = new PagerAdapter2(getActivity().getSupportFragmentManager());
        tl = rootview.findViewById(R.id.tab_layout2);
        pager = rootview.findViewById(R.id.view_paper2);
        pager.setAdapter(adapter);
        tl.setupWithViewPager(pager);
    }
}
