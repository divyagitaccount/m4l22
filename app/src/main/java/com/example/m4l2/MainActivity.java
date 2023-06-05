package com.example.m4l2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.CheckBox;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cs, pubg, val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cs =  findViewById(R.id.csgo);
        pubg =  findViewById(R.id.pubg);
        val =  findViewById(R.id.valo);


        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> {
            String str = "Games you play ";
            if (cs.isChecked()) {
                str += "Csgo ";
            }
            if (pubg.isChecked()) {
                str += "Pubg ";
            }

            if (val.isChecked()) {
                str += "Valor-ant ";
            }

            Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
        });

    }
}