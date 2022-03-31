package com.ps.parkhyatesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ViewItem extends AppCompatActivity {

    public static ArrayList<Employe_table> empDTOs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

    }
}