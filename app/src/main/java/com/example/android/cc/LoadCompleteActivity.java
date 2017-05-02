package com.example.android.cc;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoadCompleteActivity extends AppCompatActivity {

    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_complete);
        s = getIntent().getStringExtra("link");
        Toast.makeText(getApplicationContext(), s,
                Toast.LENGTH_SHORT).show();
        Task task = new Task();
        task.execute(s);

        Button back = (Button) findViewById(R.id.button6);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private class Task extends AsyncTask<String ,Void,String> {

        @Override
        protected String doInBackground(String... urls) {

            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            String result = Utils.fetchData(urls[0]);
            return result;
        }

        @Override
        protected void onPostExecute(String result) {
            // If there is no result, do nothing.
            if (result == null) {
                return;
            }

            updateUi(result);
        }
    }


    private void updateUi(String data) {

        TextView doe = (TextView)findViewById(R.id.sand);
        doe.setText(data);

    }
}


