package com.example.a16022877.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);

        //Get the intent so as to get the "things" inside the intent
        Intent i=getIntent();
        //Get the String array named "info" we passed in
        String[] info=i.getStringArrayExtra("info");
        //Get the TextView object
        TextView tv=(TextView)findViewById(R.id.textView);
        //Display name and age on TV
        tv.setText("You are " + info[0]+", age "+info[1]);
    }
}
