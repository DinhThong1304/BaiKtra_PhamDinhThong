package com.example.bai2_phamdinhthong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Show_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        //
        Intent BT = getIntent();
        // Lấy ra tên BT   , ==> ten file là:  tenBT.txt
        String tenBai = BT.getStringExtra("tenBT");



    }
}