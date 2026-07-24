import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Джонни", "Депп",  Gender.MALE, 178.7);
        Actor actor2 = new Actor("Брэд", "Пит",  Gender.MALE, 182.3);
        Actor actor3 = new Actor("Анджелина", "Джоли",  Gender.FEMALE, 171.2);

        Director director1 = new Director("Скорсезе", "Мартин", Gender.MALE, 6);
        Director director2 = new Director("Ханс", "Циммер", Gender.MALE, 56);

        MusicAuthor musicAuthor = new MusicAuthor("Сергей", "Хасанов", Gender.MALE);
        Choreographer choreographer = new Choreographer("Алиса", "Добронравова", Gender.FEMALE);

        Show show = new Show("Обычный спектакль", 138.2, director1);
        Ballet ballet = new Ballet("Баллет", 139.1, director2, musicAuthor, "ЛибреттоТекст", choreographer);
        Opera opera = new Opera("Опера", 169.2, director1, musicAuthor, "Второе либретто", 9);

        show.addActor(actor1);
        show.addActor(actor1);
        show.addActor(actor2);
        ballet.addActor(actor2);
        opera.addActor(actor3);
        opera.addActor(actor3);


        System.out.println("--------------------------------------------------------");

        show.printActors();
        ballet.printActors();
        opera.printActors();

        show.changeActor(actor3, "Пит");

        System.out.println("--------------------------------------------------------");

        show.printActors();
        ballet.printActors();
        opera.printActors();

        System.out.println("--------------------------------------------------------");
        show.changeActor(actor3, "Питер");

        System.out.println("--------------------------------------------------------");
        ballet.printLibrettoText();
        opera.printLibrettoText();
        opera.printDirector();
        ballet.printDirector();
        show.printDirector();
    }
}