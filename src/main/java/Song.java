public class Song {
    String Title;
    String Artist;
    Double Duration;

    void song(String title, String artist, Double duration){
        this.Title=title;
        this.Artist=artist;
        this.Duration=duration;
    }

    public String getArtist() {
        return Artist;
    }
    public String getTitle() {
        return Artist;
    }
    public Double getDuration(){
        return Duration;
    }

}
