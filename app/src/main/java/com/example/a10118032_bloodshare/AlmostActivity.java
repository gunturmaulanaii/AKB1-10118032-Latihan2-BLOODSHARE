package com.example.a10118032_bloodshare;

/*
Tanggal Pengerjaan : Jum'at, 30 April 2021
NIM : 10118032
Nama : Guntur Maulana Ibrahim
Kelas : IF-1
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }
    public void OnClickAlmost(View view){
        Intent intent = new Intent(this,VerifyActivity.class);
        startActivity(intent);
    }
}