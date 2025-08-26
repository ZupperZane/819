package com.example.ood_class_1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String Name;
    List<Song> Songs = new ArrayList<>();

    void addSong(Song song) {
        Songs.add(song);
    }

    void removeSong(Song song) {
        Songs.remove(song);
    }

    void playAllSongs() {
        //plays all songs
    }

    void setnull(Playlist playlist) {
        this.Name = null;
    }

    void createPlaylist(String b, String type) {
        Playlist one = new Playlist();
    }
}


