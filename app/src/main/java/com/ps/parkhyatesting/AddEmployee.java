package com.ps.parkhyatesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddEmployee extends AppCompatActivity {
    private EditText nameET, addressET, emailET, passwordET;
    private Button saveBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);
        initialzed();
    }

    private void initialzed() {
        nameET=findViewById(R.id.nameET);
        addressET=findViewById(R.id.addressET);
        emailET=findViewById(R.id.emailET);
        passwordET=findViewById(R.id.passwordET);
        saveBT=findViewById(R.id.saveBT);
        saveBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameET.getText().toString().trim().length() == 0) {
                    Toast.makeText(AddEmployee.this, "Enter Name.", Toast.LENGTH_SHORT).show();
                } else if (emailET.getText().toString().trim().length() == 0) {
                    Toast.makeText(AddEmployee.this, "Enter Email .", Toast.LENGTH_SHORT).show();
                } else if (passwordET.getText().toString().trim().length() == 0) {
                    Toast.makeText(AddEmployee.this, "Enter password .", Toast.LENGTH_SHORT).show();
                } else if (addressET.getText().toString().trim().length() == 0) {
                    Toast.makeText(AddEmployee.this, "Enter address .", Toast.LENGTH_SHORT).show();
                } else {
                    String vName = nameET.getText().toString().trim();
                    String vEmail = emailET.getText().toString().trim();
                    String vPassword = passwordET.getText().toString().trim();
                    String vAddress = addressET.getText().toString().trim();

                    Employe_table employeeDTO = new Employe_table();
                    employeeDTO.setName(vName);
                    employeeDTO.setEmail(vEmail);
                    employeeDTO.setPassword(vPassword);
                    employeeDTO.setAddress(vAddress);
                    EmployeeRecyclerViewActivity.empDTOs.add(employeeDTO);
                    Toast.makeText(AddEmployee.this, "Employee Added.", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}