import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Имя=" + name +
                ", Фамилия=" + surname +
                ", (рост= " + height + ").";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        Actor newActor = (Actor) obj;
        return Objects.equals(name, newActor.name) &&
                Objects.equals(surname, newActor.surname) &&
                Objects.equals(height, newActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
