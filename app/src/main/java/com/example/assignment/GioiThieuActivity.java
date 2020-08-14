package com.example.assignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GioiThieuActivity extends Fragment {
    private TextView mTextMessage;
    private View rootview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_gioi_thieu,container,false);
        initView();
        return rootview;
    }
    private void initView(){
        mTextMessage = rootview.findViewById(R.id.message);
        BottomNavigationView navigation = rootview.findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            =new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.navigation_home:
                    mTextMessage.setText("Home");
                    return true;

                case R.id.navigation_dashboard:
                    SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
                    String a = f.format(Calendar.getInstance().getTime());
                    mTextMessage.setText(a);
                    return true;

                case R.id.navigation_notifications:
                    mTextMessage.setText("Notifications");
                    return true;
            }
            return false;
        }
    };
}
