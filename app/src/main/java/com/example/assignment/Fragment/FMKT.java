package com.example.assignment.Fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.assignment.Adapter.KhoanThuAdapter;
import com.example.assignment.Model.KhoanThu;
import com.example.assignment.R;
import com.example.assignment.SQLite.Database;

import java.util.ArrayList;
import java.util.Date;

public class FMKT extends Fragment {
    public FMKT(){}
    ListView lv_khoanthu;
    ArrayList<KhoanThu> list;
    Database database;
    KhoanThuAdapter adapter;
    private View rootview;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_khoan_thu,container,false);
        initView();
        return rootview;
    }
    private void initView(){
        lv_khoanthu = rootview.findViewById(R.id.lv_khoanthu);
        list = new ArrayList<>();
        database = new Database(getActivity());
        adapter = new KhoanThuAdapter(getActivity(),list);
        getdata();
        lv_khoanthu.setAdapter(adapter);
    }
    public void getdata(){
        Cursor datakhoanthu = database.GetData("SELECT *  FROM THU");
        list.clear();
        while (datakhoanthu.moveToNext()){
            String a = datakhoanthu.getString(1);
            int b = datakhoanthu.getInt(3);
            list.add(new KhoanThu(a,b));
        }
        adapter.notifyDataSetChanged();
    }
}
