public class User {

    String Username;
    String Playlists;

    void createPlaylist(String name,String type){
        String Name = name;
        Playlist Name = new Playlist();
        if (type =="Rock"){
            RockPlaylist Name = new RockPlaylist();
        } else if (type =="Jazz"){
            JazzPlaylist Name = new JazzPlaylist();
        } else {
            PopPlaylist Name = new PopPlaylist();
        }
    }

    void deletePlaylist(Playlist playlist){
        playlist.setnull(playlist);
    }
    void addSongToPlaylist(Playlist playlist,Song song){
        playlist.addSong(song);
    }
    void removeSongFromPlaylist(Playlist playlist,Song song){
        playlist.removeSong(song);
    }
}
