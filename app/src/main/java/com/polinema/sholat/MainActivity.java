package com.polinema.sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button niatsholat, bacaansholat, ayatkursi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        niatsholat = (Button) findViewById(R.id.niatsholat);
        bacaansholat = (Button) findViewById(R.id.bacaansholat);
        ayatkursi = (Button) findViewById(R.id.ayatkursi);

        niatsholat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NiatSholat.class);
                finish();
                startActivity(intent);
            }
        });

        bacaansholat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BacaanSholat.class);
                finish();
                startActivity(intent);
            }
        });

        ayatkursi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AyatKursi.class);
                finish();
                startActivity(intent);
            }
        });
    }
}