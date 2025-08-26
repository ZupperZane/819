package com.example.ood_class_1;

public class User {

    String Username;
    String Playlists;

    void createPlaylist(String name,String type){

    }

    void deletePlaylist(Playlist playlist){
        playlist.setnull(playlist);
    }
    void addSongToPlaylist(Playlist playlist, Song song){
        playlist.addSong(song);
    }
    void removeSongFromPlaylist(Playlist playlist,Song song){
        playlist.removeSong(song);
    }
}
