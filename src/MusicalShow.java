import java.util.ArrayList;

public class MusicalShow extends Show{
    MusicAuthor musicAuthor;
    String librettoText;

    public MusicalShow(String title, double duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText(){
        System.out.println("Либретто: \"" + this.librettoText + "\"");

    }
}
