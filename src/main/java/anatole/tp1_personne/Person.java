package anatole.tp1_personne;

public class Person {
    private int id;
    private String name, firstname;

    public Person(int id, String name, String firstname) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.firstname + " (" + this.id + ")\n";
    }
}
