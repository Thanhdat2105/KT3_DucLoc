package com.example.kt_ducloc;

import static android.widget.Toast.*;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Listview1Activity extends AppCompatActivity {
    Intent i;
    ListView Listviewdata1;
    String []arrData = {"Lê Huế Anh","Đỗ Gia Bảo","Nguyễn Chí Cường","Đặng Thụy Thanh Duy","Lê Thanh Huy","Phạm Huỳnh Nhật Huy","Trượng Lệ Hào","Đinh Nguyễn Trường Hải","Đặng Anh Kiệt","Lê Đức Lợi","Huỳnh Hữu Lý","Huỳnh Đức Lộc","Chế Phương Nam","Trần Hiếu Nghĩa","Minh Nhựt Nguyễn Thanh","Trần Đức Nhân","Lê Phú Phúc","Trần Minh Quang","Nguyễn Trường Quý","Bùi Minh Thiên","Nguyễn Thị Bảo Trân","Nguyễn Xuân Trường","Nguyễn Văn Trung Trực","Nguyễn Trần Quang Tuyến","Nguyễn Thị Thanh Tuyền","Nguyễn Huỳnh Trung Tính","Đoàn Tường Vy","Huỳnh Thành Đạt","Nguyễn Tấn Đạt","Phạm Minh Đức"};
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ListView1 Danh sách Lớp");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Listviewdata1 = findViewById(R.id.Listviewdata1);
        adapter = new ArrayAdapter<String>(Listview1Activity.this, android.R.layout.simple_list_item_1,arrData);
        Listviewdata1.setAdapter(adapter);
        Listviewdata1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                makeText(Listview1Activity.this, "Bạn chọn: " + arrData[i], LENGTH_SHORT).show();
            }
        });
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            case R.id.menu1:
                Toast.makeText(this, "Bạn bấm vào menu 1", Toast.LENGTH_SHORT).show();
                //code xử lý khi bấm menu1
                break;
            case R.id.menu2:
                i = new Intent(Listview1Activity.this,TTSV.class);
                startActivity(i);
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(Listview1Activity.this,KTS2Activity.class);
                startActivity(i);
                break;
            case R.id.menu4:
                i = new Intent(Listview1Activity.this,ListviewActivity.class);
                startActivity(i);
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }


}