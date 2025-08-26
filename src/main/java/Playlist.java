import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String Name;
    List<Song> Songs = new ArrayList<>();

    void addSong(Song song){
        Songs.add(song);
    }
    void removeSong(Song song){
        Songs.remove(song);
    }
    void playAllSongs(){
        //plays all songs
    }
    void setnull(Playlist playlist){
        this.Name = null;
    }
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
}

class RockPlaylist extends Playlist {
}
class PopPlaylist extends Playlist {
}
class JazzPlaylist extends Playlist {
}
