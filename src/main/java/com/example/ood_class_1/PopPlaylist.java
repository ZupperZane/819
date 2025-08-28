package com.example.ood_class_1;

import java.util.ArrayList;
import java.util.List;

public class PopPlaylist implements Playlist{
    String Name;
    List<Song> Songs = new ArrayList<>();
    // Constructor
    void playlist(String name){
        this.Name=name;
        this.Songs = new ArrayList<>();
    }
    //Song Add/Drop
    public void addSong(Song song) {
        Songs.add(song);
    }
    public void removeSong(Song song) {
        Songs.remove(song);
    }
    //Play All Songs Placeholder
    public void playAllSongs() {//plays all songs//
    }
    //Delete Function
    public void setnull(Playlist playlist) {
        this.Name = null;
    }
}
