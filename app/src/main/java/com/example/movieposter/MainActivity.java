package com.example.movieposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Movie_detail.class);
                intent.putExtra("MovieName","อเวนเจอร์ส: เผด็จศึก");
                intent.putExtra("MovieImg","endgame");
                startActivity(intent);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Movie_detail.class);
                intent.putExtra("MovieName","ก็อตซิลล่า");
                intent.putExtra("MovieImg","godzila");
                startActivity(intent);
            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Movie_detail.class);
                intent.putExtra("MovieName","จิตพิฆาตโลก");
                intent.putExtra("MovieImg","inception");
                startActivity(intent);
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Movie_detail.class);
                intent.putExtra("MovieName","สตาร์ วอร์ส : กำเนิดใหม่สกายวอล์คเกอร์");
                intent.putExtra("MovieImg","starwar");
                startActivity(intent);
            }
        });




    }
}