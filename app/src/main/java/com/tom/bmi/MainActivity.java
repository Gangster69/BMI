package com.tom.bmi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {

    private EditText edweight;
    private EditText edheight;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }

    private void findView() {
        edweight = findViewById(R.id.ed_weight);
        edheight = findViewById(R.id.ed_height);
        help = findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "onClick help");
                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(R.string.bmi_info)
                        .setTitle("HELP")
                        .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .show();
            }
        });
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
        Toast.makeText(this, getString(R.string.your_bmi_is)+bmi, Toast.LENGTH_LONG).show();
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.your_bmi_is)+bmi)
                .setTitle("BMI")
                .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edweight.setText("");
                        edheight.setText("");
                    }

                })
                .show();

    }
}
