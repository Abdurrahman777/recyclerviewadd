package com.ps.parkhyatesting;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

class EmpRecyclerViewAdapter extends RecyclerView.Adapter<EmpRecyclerViewAdapter.MyViewHolder> {
    ArrayList<Employe_table>employeeDTOs;
    Context context;

    public EmpRecyclerViewAdapter(Context context, ArrayList employeeDTOs) {
        this.context = context;
        this.employeeDTOs = employeeDTOs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(employeeDTOs.get(position).getName());
        holder.phoneTV.setText(employeeDTOs.get(position).getPassword());
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context, employeeDTOs.get(position).getName(), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, employeeDTOs.get(position).getPassword(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return employeeDTOs.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,phoneTV;// init the item view's
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.nameTV);
            phoneTV= (TextView) itemView.findViewById(R.id.phoneTV);
        }
    }
}
