package com.example.ood_class_1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String Name;
    List<Song> Songs = new ArrayList<>();
// Constructor
    void setName(String name){
            this.Name=name;
        }
        //Song Add/Drop
    void addSong(Song song) {
        Songs.add(song);
    }
    void removeSong(Song song) {
        Songs.remove(song);
    }
        //Play All Songs Placeholder
    void playAllSongs() {//plays all songs//
         }
        //Delete Function
    void setnull(Playlist playlist) {
        this.Name = null;
    }
        //Create new Playlist
   // public Playlist(String b, String type) {
   //       Playlist one = new Playlist();
   // }
}


