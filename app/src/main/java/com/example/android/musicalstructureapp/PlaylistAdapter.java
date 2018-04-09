package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class PlaylistAdapter extends ArrayAdapter<Playing> {

    public PlaylistAdapter(Activity context, ArrayList<Playing> playings) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, playings);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.playlist_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Playing currentPlaying = getItem(position);

        // Find the TextView in the playlist_item.xml.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.Artist);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentPlaying.getDefaultSong());

        // Find the TextView in the playlist_item.xml.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.Song);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentPlaying.getDefaultArtist());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
