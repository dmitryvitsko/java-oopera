import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> actors = new ArrayList<>();

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getActors() {
        return this.actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor) {
        if (isAlreadyActorOnList(actor)) {
            System.out.println(actor.getName() + " " +  actor.getSurname() + " уже есть в списке");
        } else  {
            actors.add(actor);
        }
    }

    public boolean isAlreadyActorOnList(Actor actor) {
        boolean flag = false;
        if (this.getActors().contains(actor)) {
            flag = true;
        }
        return flag;
    }

    public void changeActor(Actor newActor, String lastname) {
        int index = -1;
        for (Actor a : this.getActors()) {
            if (a.getSurname().equals(lastname)) {
                index = this.getActors().indexOf(a);
                break;
            }
        }
        if (index != -1) {
            this.getActors().set(index, newActor);
        } else {
            System.out.println("При попытке замены актера, актер с такой фамилией не был найден");
        }

    }

    public void printActors() {
        for (Actor a : this.getActors()) {
            System.out.println(a.toString() + " - " + this.getTitle());
        }
    }

    public void printDirector() {
        System.out.println(director);
    }
}
