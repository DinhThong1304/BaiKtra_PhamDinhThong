package com.example.bai1_phamdinhthong;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText chieudai, chieurong, chieucao;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        chieudai = (EditText)findViewById(R.id.chieudai);
        chieurong = (EditText)findViewById(R.id.chieurong);
        chieucao = (EditText)findViewById(R.id.chieucao);
        tinhChuvi = (Button)findViewById(R.id.tinhChuVi);
        tinhDientich = (Button)findViewById(R.id.tinhDienTich);
        ketqua = (TextView)findViewById(R.id.ketqua);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cdai = Integer.parseInt(chieudai.getText().toString());
                int crong = Integer.parseInt(chieurong.getText().toString());
                int kqua = (cdai + crong) * 2;
                ketqua.setText("Chu vi hinh binh hanh la: " + kqua);
            }
        });


        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cdai = Integer.parseInt(chieudai.getText().toString());
                int ccao = Integer.parseInt(chieucao.getText().toString());
                int kqua = cdai * ccao;
                ketqua.setText("Dien tich hinh binh hanh la: " + kqua);

            }
        });



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
