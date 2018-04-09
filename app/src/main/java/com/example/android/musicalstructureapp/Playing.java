package com.example.android.musicalstructureapp;

/**
 * {@link Playing} represents a playlist item that the user wants to listen to.
 * It contains a song name and artist name for that playlist item.
 */
public class Playing {

    /** Default artist name for playlist item */
    private String mArtistName;

    /** Default song name for playlist item */
    private String mSongName;

    /**
     * Create a new com.example.android.musicalstructureapp.Playing object.
     * @param defaultArtist is the artist name
     * @param defaultSong is the song name
     */
    public Playing(String defaultArtist, String defaultSong) {
        mArtistName = defaultArtist;
        mSongName = defaultSong;
    }

    /**
     * Get the default artist name for playlist item.
     */
    public String getDefaultArtist() {
        return mArtistName;
    }

    /**
     * Get the default song name for playlist item.
     */
    public String getDefaultSong() {
        return mSongName;
    }

}