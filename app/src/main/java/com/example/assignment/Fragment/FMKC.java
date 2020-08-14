package com.example.assignment.Fragment;

import android.database.Cursor;
import android.os.Bundle;
import android.print.PrinterId;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.assignment.Adapter.KhoanChiAdapter;
import com.example.assignment.Model.KhoanChi;
import com.example.assignment.R;
import com.example.assignment.SQLite.Database;

import java.util.ArrayList;
import java.util.Date;

public class FMKC extends Fragment {
    @Override
    public void onStart() {
        super.onStart();
    }
    public FMKC(){}
    private View rootview;
    KhoanChiAdapter adapter;
    ArrayList<KhoanChi> list;
    ListView lv_khoanchi;
    Database database;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.flagment_khoan_chi,container,false);
        initView();
        return rootview;
    }
    private  void initView(){
        database = new Database(getActivity());
        lv_khoanchi = rootview.findViewById(R.id.lv_khoanchi);
        list = new ArrayList<>();
        adapter = new KhoanChiAdapter(getActivity(),R.layout.list_item_khoan_chi,list);
        Cursor datakhoanchi = database.GetData("SELECT * FROM CHI");
        list.clear();
        while (datakhoanchi.moveToNext()){
            String a = datakhoanchi.getString(1);
            int b = datakhoanchi.getInt(3);
            list.add(new KhoanChi(a,b));
        }
        adapter.notifyDataSetChanged();
        lv_khoanchi.setAdapter(adapter);
    }
}
