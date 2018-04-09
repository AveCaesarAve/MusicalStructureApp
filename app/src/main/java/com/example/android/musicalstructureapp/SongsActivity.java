package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist_list);

        ArrayList<Playing> playings = new ArrayList<Playing>();
        playings.add(new Playing("Sign of the Times", "Harry Styles"));
        playings.add(new Playing( "New Rules", "Dua Lipa"));
        playings.add(new Playing( "Luis Fonsi and Daddy Yankee featuring Justin Bieber", "Despacito"));
        playings.add(new Playing( "Lorde ", "Green Light"));
        playings.add(new Playing( "Selena Gomez", "Bad Liar"));
        playings.add(new Playing( "Kendrick Lamar", "DNA"));
        playings.add(new Playing( "Lil Uzi Vert", "XO Tour Llif3"));
        playings.add(new Playing( "Calvin Harris featuring Frank Ocean and Migos", "Slide"));
        playings.add(new Playing( "Kendrick Lamar", "HUMBLE."));
        playings.add(new Playing( "Cardi B", "Bodak Yellow"));

        PlaylistAdapter adapter = new PlaylistAdapter(this, playings);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
