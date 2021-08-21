package com.example.spider_3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    String p14;
    String p15;
    String p16;
    String p17;
    String p18;
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
        setContentView(R.layout.activity_main3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        TextView textView9 = findViewById(R.id.textView9);
        TextView textView11 = findViewById(R.id.textView11);
        TextView textView13 = findViewById(R.id.textView13);

        TextView textView14 = findViewById(R.id.textView14);
        TextView textView15 = findViewById(R.id.textView15);
        TextView textView16 = findViewById(R.id.textView16);

        TextView textView23 = findViewById(R.id.textView23);
        TextView textView24 = findViewById(R.id.textView24);
        TextView textView26 = findViewById(R.id.textView26);
        TextView textView27 = findViewById(R.id.textView27);

        Intent k =getIntent();
        String p1 = k.getStringExtra("intelligence");
        textView9.setText(p1);
        String p2 = k.getStringExtra("strength");
        textView11.setText(p2);
        String p3 = k.getStringExtra("speed");
        textView13.setText(p3);
        String p4 = k.getStringExtra("durability");
        textView16.setText(p4);
        String p5 = k.getStringExtra("power");
        textView15.setText(p5);
        String p6 =k.getStringExtra("combat");
        textView14.setText(p6);
        String p7 = k.getStringExtra("gender");
        textView24.setText(p7);
        String p8 = k.getStringExtra("race");
        textView23.setText(p8);
        String p9 = k.getStringExtra("height1");
        textView27.setText(p9);
        String p10 = k.getStringExtra("height2");
        textView26.setText(p10);

        p14 = k.getStringExtra("weight1");
        p29 = k.getStringExtra("weight2");
        p15 = k.getStringExtra("eyeColor");
        p16 = k.getStringExtra("hairColor");
        p17 = k.getStringExtra("fullName");
        p18 = k.getStringExtra("alterEgos");
        t1 = k.getStringExtra("aliases1");
        t2 = k.getStringExtra("aliases2");
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

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(i);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity3.this,MainActivity4.class);
                i.putExtra("weight1",p14);
                i.putExtra("weight2",p29);
                i.putExtra("eyeColor",p15);
                i.putExtra("hairColor",p16);

                i.putExtra("fullName",p17);
                i.putExtra("alterEgos",p18);
                i.putExtra("aliases1",t1);
                i.putExtra("aliases2",t2);
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
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MainActivity3.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
//    public void prev(View v)
//    {
//        Intent i =new Intent(MainActivity3.this,MainActivity2.class);
//        startActivity(i);
//    }
//    public void next(View v)
//    {
//        Intent i =new Intent(MainActivity3.this,MainActivity4.class);
//        i.putExtra("weight1",p14);
//        i.putExtra("weight2",p29);
//        i.putExtra("eyeColor",p15);
//        i.putExtra("hairColor",p16);
//
//        i.putExtra("fullName",p17);
//        i.putExtra("alterEgos",p18);
//        i.putExtra("aliases1",t1);
//        i.putExtra("aliases2",t2);
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
//        Intent i =new Intent(MainActivity3.this,MainActivity.class);
//        startActivity(i);
//    }
}