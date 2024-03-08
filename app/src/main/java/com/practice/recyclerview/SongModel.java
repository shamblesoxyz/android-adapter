package com.practice.recyclerview;

import android.widget.TextView;

import java.io.Serializable;

public class SongModel implements Serializable {
    private String title;
    private String artist;
    private int artwork;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getArtwork() {
        return artwork;
    }

    public void setArtwork(int artwork) {
        this.artwork = artwork;
    }

    public SongModel(String title, String artist, int artwork) {
        this.title = title;
        this.artist = artist;
        this.artwork = artwork;
    }

    public SongModel() {
    }
}
