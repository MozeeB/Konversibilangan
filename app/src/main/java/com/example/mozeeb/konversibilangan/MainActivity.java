package com.example.mozeeb.konversibilangan;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btn_octal(View view){
        Intent oc = new Intent(MainActivity.this, DecimalActivity.class);
        startActivity(oc);
    }
    public void btn_hexa(View view){
        Intent hex = new Intent(MainActivity.this, HexaActivity.class);
        startActivity(hex);
    }
}
