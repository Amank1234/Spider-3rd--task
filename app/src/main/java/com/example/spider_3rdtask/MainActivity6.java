package com.example.spider_3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    String p27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);

        TextView textView54 = findViewById(R.id.textView54);
        TextView textView56 = findViewById(R.id.textView56);
        TextView textView59 = findViewById(R.id.textView59);

        Intent k =getIntent();
        String p1 = k.getStringExtra("occupation");
        textView54.setText(p1);

        String p2 = k.getStringExtra("base");
        textView56.setText(p2);

        String p3 = k.getStringExtra("groupAffiliation");
        textView59.setText(p3);
        p27 = k.getStringExtra("relatives");

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(i);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity6.this,MainActivity7.class);
                i.putExtra("relatives",p27);
                startActivity(i);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity6.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
//    public void prev(View v)
//    {
//        Intent i =new Intent(MainActivity6.this,MainActivity5.class);
//        startActivity(i);
//    }
//    public void next(View v)
//    {
//        Intent i =new Intent(MainActivity6.this,MainActivity7.class);
//        i.putExtra("relatives",p27);
//        startActivity(i);
//    }
//    public void home(View v)
//    {
//        Intent i =new Intent(MainActivity6.this,MainActivity.class);
//        startActivity(i);
//    }
}