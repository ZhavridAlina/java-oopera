import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String printActors() {
        String result = "Актеры{";

        for (Actor actor : listOfActors) {
            result += actor.toString();
        }
        result+="}";
        System.out.println(result);
        return result;
    }

    public boolean addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Такой актер уже есть!");
                return false;
            }
        }
        listOfActors.add(newActor);
        return true;
    }

    public void replaceActor(Actor newActor, String surname) {
        for (Actor actor : listOfActors) {
            if (actor.surname == surname) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                return;
            }
        }

        System.out.println("Такого актера не существует!");
    }
}
