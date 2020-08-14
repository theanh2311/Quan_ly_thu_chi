package com.example.assignment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int i) {
        Fragment frag = null;
        switch (i){
            case 0:
                frag = new flagment2();
                break;
            case 1:
                frag = new flagment3();
                break;
            case 2:
                frag = new flagment1();
                break;
            case 3:
                frag = new GioiThieuActivity();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
