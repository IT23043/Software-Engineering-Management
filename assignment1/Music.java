package media;
public class Music {
    private String title;
    private String artist;
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void playMusic() {
        System.out.println("Playing Music");
    }
}
