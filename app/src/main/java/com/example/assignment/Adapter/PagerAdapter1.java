package com.example.assignment.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.assignment.Fragment.FMKT;
import com.example.assignment.Fragment.FMLT;

public class PagerAdapter1 extends FragmentStatePagerAdapter {


    public PagerAdapter1(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        if (i==0){
            return  new FMKT();
        }else  if (i==1){
            return  new FMLT();
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
                return "Khoản thu";
            case 1:
                return "Loại thu";
        }
        return null;
    }
}
