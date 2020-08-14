package com.example.assignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.assignment.Model.ThongKeChi;
import com.example.assignment.R;

import java.util.List;

public class ThongKeChiAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<ThongKeChi> list;

    public ThongKeChiAdapter(Context context, int layout, List<ThongKeChi> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
private class ViewHolder{
        TextView txt_ngaythang,txt_khoanchi,txt_loaichi;
}
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txt_ngaythang = (TextView)view.findViewById(R.id.txt_ngaythang1);
            holder.txt_khoanchi = (TextView)view.findViewById(R.id.txt_khoanchi);
            holder.txt_loaichi = (TextView)view.findViewById(R.id.txt_loaichi);
            view.setTag(holder);
        }else {
            holder = (ViewHolder)view.getTag();
        }


        ThongKeChi tkc = list.get(i);
        holder.txt_ngaythang.setText(tkc.getNgaythang());
        holder.txt_khoanchi.setText(tkc.getKhoanchi());
        holder.txt_loaichi.setText(tkc.getLoaichi());
        return view;
    }
}
