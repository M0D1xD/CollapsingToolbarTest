package com.example.collapsingtoolbartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = findViewById(R.id.text);
        StringBuilder s = new StringBuilder(getResources().getString(R.string.accountsAndMembership));



        for (int i = 0; i < 10; i++) {
            s.append(" \n ").append(s);
        }

    }
}
