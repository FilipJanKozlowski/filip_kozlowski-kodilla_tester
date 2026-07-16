package com.kodilla.collections.adv.exercises.my1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> findSongsByArtist(String artist) {
        List<Song> resultList = new ArrayList<>();

        for (Song song : songs) {
            if (song.getArtist().equals(artist)) {
                resultList.add(song);
            }
        }
        return resultList;
    }
}