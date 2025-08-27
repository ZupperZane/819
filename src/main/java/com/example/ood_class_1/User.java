package com.example.ood_class_1;
import java.util.ArrayList;
import java.util.List;

public class User {

    String Username;
    ArrayList<Playlist> Playlists;

    public User(String username){
        this.Username=username;
    }

    void createPlaylist(String name,String type){
        if (type=="Rock"){
            RockPlaylist Playlist = new RockPlaylist();
            Playlist.setName(name);
            Playlists.add(Playlist);
        } else if(type == "rock"){
            RockPlaylist Playlist = new RockPlaylist();
            Playlist.setName(name);
            Playlists.add(Playlist);
        } else if(type == "Pop"){
            PopPlaylist Playlist = new PopPlaylist();
            Playlist.setName(name);
            Playlists.add(Playlist);
        } else if(type == "pop"){
            PopPlaylist Playlist = new PopPlaylist();
            Playlist.setName(name);
            Playlists.add(Playlist);
        } else if(type == "jazz"){
            JazzPlaylist Playlist = new JazzPlaylist();
            Playlist.setName(name);
            Playlists.add(Playlist);
        } else if(type == "Jazz"){
            JazzPlaylist Playlist = new JazzPlaylist();
            Playlist.setName(name);
            Playlists.add(Playlist);
        } else {
            System.out.println("Type Invalid, please enter either Jazz,Rock,or Pop.");
        }
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
