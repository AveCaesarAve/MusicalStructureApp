package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        ArrayList<Playing> playings = new ArrayList<Playing>();
        playings.add(new Playing("Slow Burn", "Martha"));
        playings.add(new Playing( "36 Questions", "Part 1"));
        playings.add(new Playing( "30 for 30", "On the Ice"));
        playings.add(new Playing( "Reply All", "Skip Tracer, Part 1"));
        playings.add(new Playing( "74 Seconds", "The Traffic Stop"));
        playings.add(new Playing( "Death, Sex, and Money", "Our Student Loan Secrets, Part 1"));
        playings.add(new Playing( "The Daily", "Planning the Perfect Death"));
        playings.add(new Playing( "Longform", "Rachel Kaadzi Ghansah"));
        playings.add(new Playing( "This American Life", "Lost in the Proud"));
        playings.add(new Playing( "S-Town", "Chapter II"));

        PlaylistAdapter adapter = new PlaylistAdapter(this, playings);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
