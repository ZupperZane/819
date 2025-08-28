package com.example.ood_class_1;

import java.util.ArrayList;

public class Song {
    //Variables
    String Title;
    String Artist;
    Double Duration;
    String Genre;
    String Mood;
    //All Songs for getAllSongs Method
    private static ArrayList<Song> AllSongs = new ArrayList<>();
    //COnstructor
    public Song(String title, String artist, Double duration,String Genre,String mood){
        this.Title=title;
        this.Artist=artist;
        this.Duration=duration;
        this.Genre=Genre;
        this.Mood=mood;
        AllSongs.add(this);
    }
//Getters
    public String getArtist() {
        return Artist;
    }
    public String getTitle() {
        return Title;
    }
    public Double getDuration(){
        return Duration;
    }
    public String getGenre(){
        return Genre;
    }
    public String getMood(){
        return Mood;
    }
    //For GetAllSongs
    //      \/
    public String toString(){
        String x =" "+Title+" by: "+Artist+" Duration: "+Duration;
        return x;
    }
    public static ArrayList<Song> getAllSongs(){
        return AllSongs;
    }

    public static ArrayList<Song> SongsbyGenre(String genre){
        ArrayList<Song> Filtered = new ArrayList<Song>();
        for (Song song: AllSongs){
            String x=song.getGenre();
            if (x.equals(genre)){
                Filtered.add(song);
            }
        }
        return Filtered;
    }

    public static ArrayList<Song> SongsbyMood(String Mood){
        ArrayList<Song> Filtered = new ArrayList<Song>();
        for (Song song: AllSongs){
            String x=song.getMood();
            if (x.equals(Mood)){
                Filtered.add(song);
            }
        }
        return Filtered;
    }
}
