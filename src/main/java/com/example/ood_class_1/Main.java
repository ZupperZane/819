package com.example.ood_class_1;

public class Main {
    public static void main(String[]args){
        // Initialize User
            User Tom = new User("tom");
            //Create Playlist
            Tom.createPlaylist("calming","Jazz");
            // Initialize Songs
            Song IllusorySense = new Song("IllusorySense","Ichika Nito",3.46);
            Song FridayTheme = new Song("FridayTheme","Uglyburger0",1.21);
            Song Featherweight = new Song("Featherweight","Fleet Foxes",3.50);

    }
}
