package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.audiobooks);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, AudiobooksActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the podcast category
        TextView colors = findViewById(R.id.podcasts);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, PodcastActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the songs category
        TextView phrases = findViewById(R.id.songs);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(phrasesIntent);
            }
        });

        }

}
