package com.example.kt_ducloc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TTSV extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttsv);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("TTSV");
        actionBar.setDisplayHomeAsUpEnabled(true);
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
                i = new Intent(TTSV.this,TTSV.class);
                startActivity(i);
                break;
            case R.id.menu3:
                //code xử lý khi bấm menu3
                i = new Intent(TTSV.this,KTS2Activity.class);
                startActivity(i);
                break;
            case R.id.menu4:
                i = new Intent(TTSV.this,ListviewActivity.class);
                startActivity(i);
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }

}