package com.example.spider_3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {
    String p5;
    String p6;
    String p7;
    String p8;
    String p9;
    String p10;
    String p11;
    String p12;
    String p13;
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
        setContentView(R.layout.activity_main2);
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView6 = findViewById(R.id.textView6);
        Intent k =getIntent();
        String p1 = k.getStringExtra("id");
        textView2.setText(p1);
        String p2 = k.getStringExtra("name");
        textView4.setText(p2);
        String p3 = k.getStringExtra("slug");
        textView6.setText(p3);
        String p4 = k.getStringExtra("sm");
        Picasso.get().load(p4).into(imageView);

         p5 = k.getStringExtra("intelligence");
         p6 = k.getStringExtra("strength");
         p7 = k.getStringExtra("speed");
         p8 = k.getStringExtra("durability");
         p9 = k.getStringExtra("power");
         p10 = k.getStringExtra("combat");
         p11 = k.getStringExtra("gender");
         p12 = k.getStringExtra("race");
         p13 = k.getStringExtra("height1");
        p28 = k.getStringExtra("height2");
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
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i =new Intent(MainActivity2.this,MainActivity.class);
                 startActivity(i);
             }
         });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                 i.putExtra("intelligence",p5);
                 i.putExtra("strength",p6);
                 i.putExtra("speed",p7);
                 i.putExtra("durability",p8);
                 i.putExtra("power",p9);
                 i.putExtra("combat",p10);

                 i.putExtra("gender",p11);
                 i.putExtra("race",p12);
                 i.putExtra("height1",p13);
                 i.putExtra("height2",p28);
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
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent i =new Intent(MainActivity2.this,MainActivity.class);
                 startActivity(i);
             }
         });
    }
//    public void prev(View v)
//    {
//        Intent i =new Intent(MainActivity2.this,MainActivity.class);
//        startActivity(i);
//    }
//    public void next(View v)
//    {
//        Intent i =new Intent(MainActivity2.this,MainActivity3.class);
//        i.putExtra("intelligence",p5);
//        i.putExtra("strength",p6);
//        i.putExtra("speed",p7);
//        i.putExtra("durability",p8);
//        i.putExtra("power",p9);
//        i.putExtra("combat",p10);
//
//        i.putExtra("gender",p11);
//        i.putExtra("race",p12);
//        i.putExtra("height1",p13);
//        i.putExtra("height2",p28);
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
//        Intent i =new Intent(MainActivity2.this,MainActivity.class);
//        startActivity(i);
//    }
}