package com.example.ood_class_1;
import java.util.ArrayList;
import java.util.List;

public interface Playlist {
    void addSong(Song song);
    void removeSong(Song song);
    void playAllSongs();
    void setnull(Playlist Playlist);
}


