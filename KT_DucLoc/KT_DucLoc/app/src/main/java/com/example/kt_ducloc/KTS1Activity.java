package com.example.kt_ducloc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KTS1Activity extends AppCompatActivity {
    EditText edtCMND,edtPhone,edtDiaChi;
    Intent i ;
    public void Thoat(View view) {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kts1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("KT Số 1");
        actionBar.setDisplayHomeAsUpEnabled(true);
        edtCMND = (EditText) findViewById(R.id.edtCMND);
        edtPhone = (EditText) findViewById(R.id.edtPhone);
        edtDiaChi = (EditText) findViewById(R.id.edtDiaChi);
    }

    public void xulycapnhat(View view) {
        Toast.makeText(this, "Bạn nhấn cập nhật", Toast.LENGTH_SHORT).show();
    }

    public void xulylamlai(View view) {
        edtCMND.setText("");
        edtPhone.setText("");
        edtDiaChi.setText("");
        edtCMND.requestFocus();
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
                i = new Intent(KTS1Activity.this,TTSV.class);
                startActivity(i);
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(KTS1Activity.this,KTS2Activity.class);
                startActivity(i);
                break;
            case R.id.menu4:
                i = new Intent(KTS1Activity.this,ListviewActivity.class);
                startActivity(i);
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}