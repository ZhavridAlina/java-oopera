import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Александр", "Сидоров", Gender.MALE, 185);
        Actor actor3 = new Actor("Наталья", "Петрова", Gender.FEMALE, 170);

        Director director1 = new Director("Василий", "Новиков", Gender.MALE, 15);
        Director director2 = new Director("Елена", "Ковалёва", Gender.FEMALE, 7);

        Person musicAuthor = new Person("Виктор", "Козлов", Gender.MALE);
        Person choreographer = new Person("Ирина", "Ковалевич", Gender.FEMALE);

        Show show = new Show("Звездопад", 230, director1, new ArrayList<>());
        Opera opera = new Opera("Гроза", 430, director1, new ArrayList<>(), musicAuthor,
                "Либретто текст для оперы", 45);
        Ballet ballet = new Ballet("Богема", 290, director2, new ArrayList<>(), musicAuthor,
                "Либретто текст для балета", choreographer);

        show.addActor(actor1);
        show.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        opera.replaceActor(actor1, "Сидоров");
        opera.printActors();

        show.replaceActor(actor2, "Макаров");
        show.printActors();

        opera.printLibretto();
        ballet.printLibretto();
    }
}
