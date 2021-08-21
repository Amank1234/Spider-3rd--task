package com.example.spider_3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Button button16 = findViewById(R.id.button16);

        Button button18 = findViewById(R.id.button18);
        TextView textView61 = findViewById(R.id.textView61);
        Intent k =getIntent();
        String p1 = k.getStringExtra("relatives");
        textView61.setText(p1);

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity7.this,MainActivity6.class);
                startActivity(i);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity7.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
//    public void prev(View v)
//    {
//        Intent i =new Intent(MainActivity7.this,MainActivity6.class);
//        startActivity(i);
//    }
//
//    public void home(View v)
//    {
//        Intent i =new Intent(MainActivity7.this,MainActivity.class);
//        startActivity(i);
//    }
}