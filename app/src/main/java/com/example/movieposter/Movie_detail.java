package com.example.movieposter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Movie_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        Intent intent = getIntent();
        String MovieName = intent.getStringExtra("MovieName");
        String MovieImg = intent.getStringExtra("MovieImg");

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        if (MovieImg.equals("starwar")) {
            imageView.setImageResource(R.drawable.starwar);
        } else if (MovieImg.equals("inception")) {
            imageView.setImageResource(R.drawable.inception);
        } else if (MovieImg.equals("godzila")) {
            imageView.setImageResource(R.drawable.godzila);
        } else  {
            imageView.setImageResource(R.drawable.endgame);
        }

//        switch (MovieImg){
//            case"starwar": imageView.setImageResource(R.drawable.starwar);
//            case"inception": imageView.setImageResource(R.drawable.inception);
//            case"godzila": imageView.setImageResource(R.drawable.godzila);
//            case"endgame": imageView.setImageResource(R.drawable.endgame);
//            default: imageView.setImageResource(R.drawable.starwar);



        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(MovieName);

    }
}