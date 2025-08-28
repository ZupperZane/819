package com.example.ood_class_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        // Initialize User
        User Tom = new User("tom");
        //Create Playlist
        Tom.createPlaylist("calming","Jazz");
        // Initialize Songs
        Song IllusorySense = new Song("IllusorySense","Ichika Nito",3.46,"Jazz","Calm");
        Song FridayTheme = new Song("FridayTheme","Uglyburger0",1.21,"Jazz","Calm");
        Song Featherweight = new Song("Featherweight","Fleet Foxes",3.50,"Pop","Calm");
        Song RockLobster = new Song("RockLobster","The B-52's",6.49,"Rock","Happy");
        Song HighwayToHell = new Song("HighwayToHell","AC/DC",3.28,"Rock","Happy");
        Song WelcomeToTheJungle = new Song("WelcomeToTheJungle","Guns N' Roses",6.49,"Rock","Happy");
        Song OnlyYou = new Song("OnlyYou","The Platters",2.45,"Jazz","Somber");
        Song WellMeetAgain = new Song("WellMeetAgain","The Ink Spots",3.11,"Jazz","Calm");
        Song BlueMoon = new Song("BlueMoon","Billie Holiday",3.27,"Jazz","Calm");
        Song Eddie = new Song("Eddie","Jhonathan Adams",2.46,"Pop","Happy");
        Song Iris = new Song("Iris","The Goo Goo Dolls",4.49,"Pop","Somber");
        Song KissFromARose = new Song("Kiss From a Rose","Seal",4.48,"Pop","Somber");
        Song IDontWantToMissAThing = new Song("I Don't Want to Miss a thing","Aerosmith",4.58,"Pop","Somber");
        Song MoreThanAFeeling = new Song("More than a Feeling","Boston",4.45,"Rock","Happy");
        Song CarryOnWaywardSon = new Song("Carry on Wayward Son","Kansas",5.23,"Rock","Happy");
        System.out.println(Song.getAllSongs());
        // get Playlist from Array
        Playlist firstPlaylist = Tom.Playlists.get(0);
        // use method from User
        Tom.addSongToPlaylist(firstPlaylist, IllusorySense);
        Tom.addSongToPlaylist(firstPlaylist, FridayTheme);
        Tom.addSongToPlaylist(firstPlaylist, Featherweight);
        //remove test
        Tom.removeSongFromPlaylist(firstPlaylist, IllusorySense);
        Tom.removeSongFromPlaylist(firstPlaylist, FridayTheme);
        Tom.removeSongFromPlaylist(firstPlaylist, Featherweight);
        // Delete Test
        Tom.deletePlaylist(Tom.Playlists.get(0));
        // Recommendation Test
        Tom.GenerateRecomendation("Rock");
        Tom.GenerateRecomendation("Pop");
        Tom.GenerateRecomendation("Jazz");
        //1c)b Songs by user and mood
        System.out.println(Song.getAllSongs());
        System.out.println(Song.SongsbyGenre("Rock"));
        System.out.println(Song.SongsbyMood("Calm"));
    }
}