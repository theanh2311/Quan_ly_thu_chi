package com.example.assignment.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.assignment.Fragment.FMKC;
import com.example.assignment.Fragment.FMLC;

public class PagerAdapter2 extends FragmentStatePagerAdapter {
    public PagerAdapter2( FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        if (i==0){
            return  new FMKC();
        }else  if (i==1){
            return  new FMLC();
        }else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
    @Override
    @Nullable
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Khoản chi";
            case 1:
                return "Loại chi";
        }
        return null;
    }
}
