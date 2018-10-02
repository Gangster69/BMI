package com.tom.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bmi(View view) {
        EditText edweight = findViewById(R.id.ed_weight);
        EditText edheight = findViewById(R.id.ed_height);
        Log.d("MainActivity", "bmi");
        String w = edweight. getText().toString();
        String h = edheight. getText().toString();
        Log.d("MainActivity" ,w+"/"+h);
        float weight =Float.parseFloat(w);
        float height =Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("MainActivity", bmi+"" );
    }
}
