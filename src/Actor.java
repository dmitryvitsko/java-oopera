import java.util.Objects;

public class Actor extends Person {
    double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Актер: " + this.name + " " + this.surname + " (" + this.height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Actor other = (Actor) obj;
        return Objects.equals(this.name, other.name) && Objects.equals(this.surname, other.surname) && Objects.equals(this.height, other.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.surname, this.height);
    }
}
