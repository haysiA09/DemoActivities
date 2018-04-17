package com.example.a16022877.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDone=(Button)findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText etName=(EditText)findViewById(R.id.editTextName);
                EditText etAge=(EditText)findViewById(R.id.editTextAge);
                //Put the name and age into an array
                String[] info={etName.getText().toString(),etAge.getText().toString()};
                //Create an intent ti start another activity(DemoActivity)
                Intent i=new Intent(MainActivity.this,DemoActivity2.class);
                //Pass the String array holding name and age to new activity
                i.putExtra("info",info);
                startActivity(i);

            }
        });
    }
}
