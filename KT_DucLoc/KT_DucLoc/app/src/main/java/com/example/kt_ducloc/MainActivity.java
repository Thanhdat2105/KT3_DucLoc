package com.example.kt_ducloc;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView,imageView2,imageView3,imageView5,imageView4;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3= findViewById(R.id.imageView3);
    }

    public void Thoat(View view) {
        //Tạo đối tượng
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        //Thiết lập tiêu đề
        b.setTitle("Xác nhận");
        b.setMessage("Bạn có đồng ý thoát chương trình không?");
        // Nút Ok
        b.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        //Nút Cancel
        b.setNegativeButton("Không đồng ý", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        //Tạo dialog
        AlertDialog al = b.create();
        //Hiển thị
        al.show();
    }


    public void so1(View view) {
        imageView.setOnClickListener(v ->{
            i = new Intent(MainActivity.this,KTS1Activity.class);
            startActivity(i);
        });
}

    public void so2(View view) {
        imageView2.setOnClickListener(v ->{
            i = new Intent(MainActivity.this,KTS2Activity.class);
            startActivity(i);
        });
    }
    public void so3(View view) {
        imageView3.setOnClickListener(v ->{
            i = new Intent(MainActivity.this,ListviewActivity.class);
            startActivity(i);
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
                i = new Intent(MainActivity.this,TTSV.class);
                startActivity(i);
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(MainActivity.this,KTS2Activity.class);
                startActivity(i);
                break;
            case R.id.menu4:
                i = new Intent(MainActivity.this,ListviewActivity.class);
                startActivity(i);
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }



}