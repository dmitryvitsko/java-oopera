import java.util.ArrayList;

public class Show {
    String title;
    double duration;
    Director director;
    ArrayList<Actor> actors = new ArrayList<>();

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void addActor(Actor actor) {
        if (actors.isEmpty()) {
            actors.add(actor);
        } else {
            int count = 0;
            for (Actor a : actors) {
                if (a.equals(actor)) {
                    return;
                } else  {
                    count++;
                }
            }
            if (count == actors.size()) {
                actors.add(actor);
            }
        }
    }

    public void changeActor(Actor newActor, String lastname) {
        int index = -1;
        for (Actor a : actors) {
            if (a.surname.equals(lastname)) {
                index = actors.indexOf(a);
                break;
            }
        }
        if (index != -1) {
            actors.set(index, newActor);
        } else {
            System.out.println("При попытке замены актера, актер с такой фамилией не был найден");
        }

    }

    public void printActors() {
        for (Actor actor : actors) {
            System.out.println(actor + " - " + this.title);
        }
    }
}
