 package com.ps.parkhyatesting;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class EmployeeRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView itemRV;
    private Button addEmpBT;
    private ArrayList<String> employees;
    public static ArrayList<Employe_table> empDTOs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emp_recycle_view);
        initializeView();
    }

    private void initializeView() {
        itemRV = findViewById(R.id.itemRV);
        addEmpBT= findViewById(R.id.addEmpBT);
        employees = new ArrayList<>();
        empDTOs = new ArrayList<>();
        addEmpBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeeRecyclerViewActivity.this,AddEmployee.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        customeItemNameListDemo();
    }

    private void customeItemNameListDemo() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        itemRV.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView
        EmpRecyclerViewAdapter empAdapter = new EmpRecyclerViewAdapter(this, empDTOs);
        itemRV.setAdapter(empAdapter);
    }
}
