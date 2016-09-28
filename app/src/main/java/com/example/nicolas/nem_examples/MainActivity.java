package com.example.nicolas.nem_examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MainActivity", "This is an information message");
        Log.wtf("MainActivity", "This is a WTF/Assertion Failure message.");
        Log.e("MainActivity", "This is an error message");

    }
}
