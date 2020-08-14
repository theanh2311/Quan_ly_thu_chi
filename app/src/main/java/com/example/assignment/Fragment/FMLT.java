package com.example.assignment.Fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.assignment.Adapter.LoaiChiAdapter;
import com.example.assignment.Adapter.LoaiThuAdapter;
import com.example.assignment.Model.LoaiChi;
import com.example.assignment.Model.LoaiThu;
import com.example.assignment.R;
import com.example.assignment.SQLite.Database;

import java.util.ArrayList;

public class FMLT extends Fragment {
    public FMLT() {
    }
    private View rootview;
    Database database;
    ArrayList<LoaiThu> list;
    LoaiThuAdapter adapter;
    ListView lv_loaithu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_loai_thu,container,false);
        initView();
        return rootview;
    }
    private  void  initView(){
        lv_loaithu= rootview.findViewById(R.id.lv_loaithu);
        list = new ArrayList<>();
        database = new Database(getActivity());
        adapter = new LoaiThuAdapter(getActivity(),R.layout.list_item_loai_thu,list);
        Cursor dataloaithu = database.GetData("SELECT * FROM THU");
        list.clear();
        //dataloaithu.moveToFirst();
        while (dataloaithu.moveToNext()){
            String a = dataloaithu.getString(2);
            int b = dataloaithu.getInt(3);
            list.add(new LoaiThu(a,b));
        }
        adapter.notifyDataSetChanged();
        lv_loaithu.setAdapter(adapter);

    }
    }

