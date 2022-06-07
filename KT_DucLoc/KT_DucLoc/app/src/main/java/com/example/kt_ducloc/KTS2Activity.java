package com.example.kt_ducloc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KTS2Activity extends AppCompatActivity {
    Button button;
    EditText edtNamDuong, txtNamAm;
    Intent i;

    @SuppressLint("WrongViewCast")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kts2);
        button=findViewById(R.id.button);
        edtNamDuong=findViewById(R.id.edtNamDuong);
        txtNamAm=findViewById(R.id.txtNamAn);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("KT Số 2");
        actionBar.setDisplayHomeAsUpEnabled(true);
    }


    public void xuLyChuyenDuongQuaAm(View view) {
        String []arrCan={"Canh","Tân","Nhâm","Quý","Giáp","Ất","Bính","Đinh","Mậu","Kỷ"};
        String []arrChi={"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
        int namDuong=Integer.parseInt(edtNamDuong.getText().toString());
        String can=arrCan[namDuong%10];
        String chi=arrChi[namDuong%12];
        txtNamAm.setText(can+" "+chi);

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
                i = new Intent(KTS2Activity.this,TTSV.class);
                startActivity(i);
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(KTS2Activity.this,KTS2Activity.class);
                startActivity(i);
                break;
            case R.id.menu4:
                i = new Intent(KTS2Activity.this,ListviewActivity.class);
                startActivity(i);
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

}
