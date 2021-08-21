package com.example.spider_3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    String p24;
    String p25;
    String p26;
    String p27;


    String t3;
    String t4;
    String t5;
    String t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);

        TextView textView45 = findViewById(R.id.textView45);
        TextView textView47 = findViewById(R.id.textView47);
        TextView textView49 = findViewById(R.id.textView49);

        TextView textView51 = findViewById(R.id.textView51);

        TextView textView42 = findViewById(R.id.textView42);
        TextView textView63 = findViewById(R.id.textView63);
        TextView textView43 = findViewById(R.id.textView43);

        TextView textView64 = findViewById(R.id.textView64);
        Intent k =getIntent();
        String p1 = k.getStringExtra("placeOfBirth");
        textView45.setText(p1);
        String p2 = k.getStringExtra("firstAppearance");
        textView47.setText(p2);
        String p3 = k.getStringExtra("publisher");
        textView49.setText(p3);
        String p4 = k.getStringExtra("alignment");
        textView51.setText(p4);
        t3 = k.getStringExtra("aliases3");
        textView42.setText(t3);
        t4 = k.getStringExtra("aliases4");
        textView63.setText(t4);
        t5 = k.getStringExtra("aliases5");
        textView43.setText(t5);
        t6 = k.getStringExtra("aliases6");
        textView64.setText(t6);


        p24 = k.getStringExtra("occupation");
        p25 = k.getStringExtra("base");
        p26 = k.getStringExtra("groupAffiliation");
        p27 = k.getStringExtra("relatives");

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity5.this,MainActivity4.class);
                startActivity(i);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity5.this,MainActivity6.class);
                i.putExtra("occupation",p24);
                i.putExtra("base",p25);

                i.putExtra("groupAffiliation",p26);
                i.putExtra("relatives",p27);
                startActivity(i);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity5.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
//    public void prev(View v)
//    {
//        Intent i =new Intent(MainActivity5.this,MainActivity4.class);
//        startActivity(i);
//    }
//    public void next(View v)
//    {
//        Intent i =new Intent(MainActivity5.this,MainActivity6.class);
//        i.putExtra("occupation",p24);
//        i.putExtra("base",p25);
//
//        i.putExtra("groupAffiliation",p26);
//        i.putExtra("relatives",p27);
//        startActivity(i);
//    }
//    public void home(View v)
//    {
//        Intent i =new Intent(MainActivity5.this,MainActivity.class);
//        startActivity(i);
//    }
}