package com.example.assignment.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment.MainActivity;
import com.example.assignment.Model.LoaiThu;
import com.example.assignment.Model.LoaiThu;
import com.example.assignment.R;
import com.example.assignment.SQLite.Database;

import java.util.List;

public class LoaiThuAdapter extends BaseAdapter {
    Context context;
    int layout;
    List<LoaiThu> loaiThuList;

    public LoaiThuAdapter(Context context, int layout, List<LoaiThu> loaiThuList) {
        this.context = context;
        this.layout = layout;
        this.loaiThuList = loaiThuList;
    }

    @Override
    public int getCount() {
        return loaiThuList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    private   class ViewHolder{
        TextView txtloaithu;
        ImageView loaithusua;
    }
    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtloaithu = (TextView) view.findViewById(R.id.txtloaithu);
            holder.loaithusua = (ImageView) view.findViewById(R.id.loaithusua);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        final LoaiThu lt = loaiThuList.get(i);
        holder.txtloaithu.setText(lt.getLoaithu());

        holder.loaithusua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.dialog_sua);

                final EditText edtsua = (EditText) dialog.findViewById(R.id.edt_sua);
                Button btnsua = (Button) dialog.findViewById(R.id.btn_sua);
                edtsua.setText(lt.getLoaithu());
                btnsua.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String a = edtsua.getText().toString();
                        int b = lt.getIdthu();
                        if (a.isEmpty()) {
                            Toast.makeText(context, "Vui lòng không để trống loại thu", Toast.LENGTH_SHORT).show();
                        } else {
                            Database database = new Database(context);
                            database.SendData("UPDATE THU SET LOAITHU = '" + a + "' WHERE IDTHU = " + b + " ");
                            dialog.dismiss();
                            Toast.makeText(context, "Cập nhật loại thu thành công", Toast.LENGTH_SHORT).show();
                            ((MainActivity) context).recreate();
                        }
                    }
                });dialog.show();
            }
        });
        return view;
    }
}
