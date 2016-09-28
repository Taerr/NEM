package com.example.nicolas.nem_examples;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //example 2
        //Log.i("MainActivity", "This is an information message");
        //Log.wtf("MainActivity", "This is a WTF/Assertion Failure message.");
        //Log.e("MainActivity", "This is an error message");

        //example 3
        //Toast.makeText(this, "This is a long toast message", Toast.LENGTH_LONG).show();
        //Toast.makeText(this, "This is a short toast message", Toast.LENGTH_SHORT).show();

        //example 4
        //TextView tv = (TextView) findViewById(R.id.textview);
        //tv.setText("This was changed from inside MainActivity");
        //tv.setTextSize(20);

        //example 5
        //Resources resources = getResources();
        //String s = resources.getQuantityString(R.plurals.dollarPlural, 2, 2);
        //TextView tv = (TextView) findViewById(R.id.textview);
        //tv.setText(s);

        //example 6
        Resources resources = getResources();
        TypedArray taStringArray = resources.obtainTypedArray(R.array.myStringArray);
        String s = taStringArray.getString(0) + ", " + taStringArray.getString(1) + ", " + taStringArray.getString(2);
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(s);
    }
}
