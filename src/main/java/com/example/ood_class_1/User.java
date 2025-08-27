package com.example.ood_class_1;
import java.util.ArrayList;
import java.util.List;

public class User {

    String Username;
    ArrayList<Playlist> Playlists;

    void createPlaylist(String name,String type){
        if (type=="Rock"){

        } else if(type == "rock"){

        } else if(type == "Pop"){

        } else if(type == "pop"){

        } else if(type == "jazz"){

        } else if(type == "Jazz"){

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
