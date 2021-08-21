package com.example.spider_3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    String p19;
    String p20;
    String p21;
    String p22;
    String p23;
    String p24;
    String p25;
    String p26;
    String p27;
    String p28;
    String p29;

    String t1;
    String t2;
    String t3;
    String t4;
    String t5;
    String t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);

        TextView textView29 = findViewById(R.id.textView29);
        TextView textView30 = findViewById(R.id.textView30);
        TextView textView32 = findViewById(R.id.textView32);

        TextView textView34 = findViewById(R.id.textView34);
        TextView textView37 = findViewById(R.id.textView37);
        TextView textView39 = findViewById(R.id.textView39);

        TextView textView41 = findViewById(R.id.textView41);
        TextView textView62 = findViewById(R.id.textView62);
        Intent k =getIntent();
        String p1 = k.getStringExtra("weight1");
        textView29.setText(p1);
        String p2 = k.getStringExtra("weight2");
        textView30.setText(p2);
        String p3 = k.getStringExtra("eyeColor");
        textView32.setText(p3);
        String p4 = k.getStringExtra("hairColor");
        textView34.setText(p4);
        String p5 = k.getStringExtra("fullName");
        textView37.setText(p5);
        String p6 = k.getStringExtra("alterEgos");
        textView39.setText(p6);

        t1 = k.getStringExtra("aliases1");
        textView41.setText(t1);
        t2 = k.getStringExtra("aliases2");
        textView62.setText(t2);
        t3 = k.getStringExtra("aliases3");
        t4 = k.getStringExtra("aliases4");
        t5 = k.getStringExtra("aliases5");
        t6 = k.getStringExtra("aliases6");
        p20 = k.getStringExtra("placeOfBirth");
        p21 = k.getStringExtra("firstAppearance");
        p22 = k.getStringExtra("publisher");
        p23 = k.getStringExtra("alignment");
        p24 = k.getStringExtra("occupation");
        p25 = k.getStringExtra("base");
        p26 = k.getStringExtra("groupAffiliation");
        p27 = k.getStringExtra("relatives");

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(i);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity4.this,MainActivity5.class);

                i.putExtra("aliases3",t3);
                i.putExtra("aliases4",t4);
                i.putExtra("aliases5",t5);
                i.putExtra("aliases6",t6);
                i.putExtra("placeOfBirth",p20);
                i.putExtra("firstAppearance",p21);
                i.putExtra("publisher",p22);
                i.putExtra("alignment",p23);

                i.putExtra("occupation",p24);
                i.putExtra("base",p25);

                i.putExtra("groupAffiliation",p26);
                i.putExtra("relatives",p27);
                startActivity(i);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity4.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
//    public void prev(View v)
//    {
//        Intent i =new Intent(MainActivity4.this,MainActivity3.class);
//        startActivity(i);
//    }
//    public void next(View v)
//    {
//        Intent i =new Intent(MainActivity4.this,MainActivity5.class);
//
//        i.putExtra("aliases3",t3);
//        i.putExtra("aliases4",t4);
//        i.putExtra("aliases5",t5);
//        i.putExtra("aliases6",t6);
//        i.putExtra("placeOfBirth",p20);
//        i.putExtra("firstAppearance",p21);
//        i.putExtra("publisher",p22);
//        i.putExtra("alignment",p23);
//
//        i.putExtra("occupation",p24);
//        i.putExtra("base",p25);
//
//        i.putExtra("groupAffiliation",p26);
//        i.putExtra("relatives",p27);
//        startActivity(i);
//    }
//    public void home(View v)
//    {
//        Intent i =new Intent(MainActivity4.this,MainActivity.class);
//        startActivity(i);
//    }
}