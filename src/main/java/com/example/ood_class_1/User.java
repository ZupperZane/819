package com.example.ood_class_1;
import java.util.ArrayList;
import java.util.List;

public class User {

    // Variables
    String Username;
    ArrayList<Playlist> Playlists;
    // Constructor
    public User(String username){
        this.Username=username;
        this.Playlists = new ArrayList<>();
    }
    //Playlist & Modifications
    void createPlaylist(String name,String type){
        if (type=="Rock"){
            RockPlaylist Playlist = new RockPlaylist();
            Playlist.playlist(name);
            Playlists.add(Playlist);
        } else if(type == "rock"){
            RockPlaylist Playlist = new RockPlaylist();
            Playlist.playlist(name);
            Playlists.add(Playlist);
        } else if(type == "Pop"){
            PopPlaylist Playlist = new PopPlaylist();
            Playlist.playlist(name);
            Playlists.add(Playlist);
        } else if(type == "pop"){
            PopPlaylist Playlist = new PopPlaylist();
            Playlist.playlist(name);
            Playlists.add(Playlist);
        } else if(type == "jazz"){
            JazzPlaylist Playlist = new JazzPlaylist();
            Playlist.playlist(name);
            Playlists.add(Playlist);
        } else if(type == "Jazz"){
            JazzPlaylist Playlist = new JazzPlaylist();
            Playlist.playlist(name);
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
    //pregen Recomendations
    void GenerateRecomendation(String type){
        if (type == "Rock"){
            System.out.println("For the Genre:Rock, I would Recommend:Rock Lobster by the b-52's,Highway to Hell by AC/DC,and Welcome to the Jungle by Gun's N Roses.");
        } else if (type == "Jazz"){
            System.out.println("For the Genre:Rock, I would Recommend:Blue Moon by Billie Holiday,We'll Meet Again by The Ink Spots, and Only You, by The Platters.");
        } else if (type == "Pop"){
            System.out.println("For the Genre:Pop, I would Recommend:Iris by The Goo Goo Dolls,Kiss From a Rose by Seal,and I Don't Want to Miss a Thing by Aerosmith. ");
        } else{
            System.out.println("Invalid Genre Type");
        }
    }
}
