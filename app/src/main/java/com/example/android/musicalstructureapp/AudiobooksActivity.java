package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        ArrayList<Playing> playings = new ArrayList<Playing>();
        playings.add(new Playing("Jason Reynolds", "Long Way Down"));
        playings.add(new Playing( "Joan Didion", "South and West"));
        playings.add(new Playing( "Ellen Oh", "Flying Lessons & Other Stories"));
        playings.add(new Playing( "Mohsin Hamid", "Exit West"));
        playings.add(new Playing( "Scaachi Koul", "One Day We’ll All Be Dead"));
        playings.add(new Playing( "Cressida Cowell", "The Wizards of Once"));
        playings.add(new Playing( "Rachel Cohn", "Kill All Happies"));
        playings.add(new Playing( "Elizabeth Wein", "The Pearl Thief"));
        playings.add(new Playing( "Ibi Zoboi", "American Street"));
        playings.add(new Playing( "David Grann", "Killers of the Flower Moon"));

        PlaylistAdapter adapter = new PlaylistAdapter(this, playings);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
