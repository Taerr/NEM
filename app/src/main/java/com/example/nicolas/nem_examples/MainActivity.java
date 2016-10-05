package com.example.nicolas.nem_examples;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    private int clicks;
    private TextView tv_display;
    private Button btn_clickme;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_clickme = (Button) findViewById(R.id.btn_clickme);
        btn_clickme.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                clicks++;
                tv_display.setText("Button has been clicked " + clicks + " times.");
            }
        });

        clicks = 0;
        tv_display = (TextView) findViewById(R.id.tv_display);
    }

    //public void buttonPress (View arg0){
    //    clicks ++;
    //    tv_display.setText("Button has been clicked " + clicks + " times.");
    //}
}
















