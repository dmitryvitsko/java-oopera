import java.util.ArrayList;

public class MusicalShow extends Show{
    private MusicAuthor musicAuthor;
    private String librettoText;

    public MusicalShow(String title, double duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicAuthor getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(MusicAuthor musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibrettoText(){
        System.out.println("Либретто: \"" + this.librettoText + "\"");

    }
}