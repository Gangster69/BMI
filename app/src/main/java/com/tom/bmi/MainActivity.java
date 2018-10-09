package com.tom.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    private EditText edweight;
    private EditText edheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);
    }

    public void bmi(View view) {

        Log.d("MainActivity", "bmi");
        String w = edweight. getText().toString();
        String h = edheight. getText().toString();
        Log.d("MainActivity" ,w+"/"+h);
        float weight =Float.parseFloat(w);
        float height =Float.parseFloat(h);
        float bmi = weight / (height * height);
        Log.d("MainActivity", bmi+"" );
        Toast.makeText(this, "your bmi is "+bmi, Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setMessage("your bmi is "+bmi)
                .setTitle("BMI")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edweight.setText("");
                        edheight.setText("");
                    }

                })
                .show();

    }
}
