package com.example.android.musicalstructureapp;

/**
 * {@link Playing} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Playing {

    /** Default translation for the word */
    private String mArtistName;

    /** Miwok translation for the word */
    private String mSongName;

    /**
     * Create a new com.example.android.miwok.Playing object.
     *
     * @param defaultArtist is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param defaultSong is the word in the Miwok language
     */
    public Playing(String defaultArtist, String defaultSong) {
        mArtistName = defaultArtist;
        mSongName = defaultSong;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultArtist() {
        return mArtistName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getDefaultSong() {
        return mSongName;
    }

}