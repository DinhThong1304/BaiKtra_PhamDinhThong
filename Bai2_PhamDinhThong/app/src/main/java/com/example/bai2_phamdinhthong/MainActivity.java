package com.example.bai2_phamdinhthong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        ArrayList<String> listPoem =  new ArrayList<String>();
        listPoem.add("Viet Nam Que Huong Ta");
        listPoem.add("Duong Ve Que Me");
        listPoem.add("Trang Giang");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listPoem);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_cai_bai_tho);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // do sth
                // Cần làm Lấy về tên bài thơ
                String tenBaiTho = listPoem.get(i);
                // Chuyển Activity
                Intent intentBT = new Intent(MainActivity.this, Show_Activity.class);
                // gói tên vào
                intentBT.putExtra("tenBT",tenBaiTho);
                // Đẩy sang
                startActivity(intentBT);
            }
        });
    }


}