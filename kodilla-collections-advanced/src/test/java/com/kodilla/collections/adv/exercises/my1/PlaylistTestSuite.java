package com.kodilla.collections.adv.exercises.my1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTestSuite {

    @Test
    public void testFindSongsByArtist() {
        Playlist playlist = new Playlist();
        Song song1 = new Song("Rihanna", "Umbrella");
        Song song2 = new Song("Sia", "Big Girls Cry");
        Song song3 = new Song("Sia", "Unstoppable");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        List<Song> result = playlist.findSongsByArtist("Sia");

        List<Song> expectedList = new ArrayList<>();
        expectedList.add(song2);
        expectedList.add(song3);

        assertEquals(expectedList, result);
    }
}