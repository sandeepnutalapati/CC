package com.example.android.cc;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ControlActivity extends AppCompatActivity {

    String ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        ip = getIntent().getStringExtra("ip");

        Button load1View = (Button) findViewById(R.id.button2);
        load1View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent load1 = new Intent(ControlActivity.this, LoadCompleteActivity.class);
                String link =  "http://"+ip+"/11";
                load1.putExtra("link",link);

                startActivity(load1);
            }
        });

        Button load2View = (Button) findViewById(R.id.button3);
        load2View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent load2 = new Intent(ControlActivity.this, LoadCompleteActivity.class);
                String link =  "http://"+ip+"/12";
                load2.putExtra("link",link);
                startActivity(load2);
            }
        });

        Button load3View = (Button) findViewById(R.id.button4);
        load3View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent load3 = new Intent(ControlActivity.this, LoadCompleteActivity.class);
                String link =  "http://"+ip+"/21";
                load3.putExtra("link",link);
                startActivity(load3);
            }
        });

        Button load4View = (Button) findViewById(R.id.button5);
        load4View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent load4 = new Intent(ControlActivity.this, LoadCompleteActivity.class);
                String link =  "http://"+ip+"/22";
                load4.putExtra("link",link);
                startActivity(load4);
            }
        });
    }
}

