package com.example.android.cc;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eText;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (EditText) findViewById(R.id.edittext);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btn) {
                String str = eText.getText().toString();
                Toast.makeText(getApplicationContext(),str,
                        Toast.LENGTH_SHORT).show();
                Intent control = new Intent(MainActivity.this, ControlActivity.class);
                control.putExtra("ip", str);
                startActivity(control);
            }
        });
    }
}

