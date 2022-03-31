package com.ps.parkhyatesting;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmpAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Employe_table> empDTOs;

    public EmpAdapter(Context context, ArrayList<Employe_table> empDTOs) {
        this.context = context;
        this.empDTOs = empDTOs;
    }
    @Override
    public int getCount() {
        return empDTOs.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_row, parent, false);
        TextView nameTV = convertView.findViewById(R.id.nameTV);
        TextView  phoneTV = convertView.findViewById(R.id.phoneTV);
        nameTV.setText(empDTOs.get(position).getName());
        phoneTV.setText(empDTOs.get(position).getPassword());
        return convertView;
    }
}