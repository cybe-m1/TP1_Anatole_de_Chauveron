package anatole.tp1_personne;

import java.util.ArrayList;
import java.util.List;
import anatole.tp1_personne.Person;
import anatole.tp1_personne.PersonRepository;

public class PersonRepositoryImpl implements PersonRepository {
    private List<Person> personList = Lists.of(
            new Person(1, "Anatole", "de Chauveron"),
            new Person(2, "Oscar", "Lehideux"),
            new Person(3, "Lenny", "Cossard")
    );

    @Override
    public List<Person> getAll() {
        return this.personList;
    }

    @Override
    public Person get(int id) {
        return null;
    }

    @Override
    public Person get_by_name(String name) {
        return null;
    }

    @Override
    public Person get_by_firstname(String firstname) {
        return null;
    }

    @Override
    public void create(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public String toString() {
        String returned_string = "[";
        returned_string.append(this.personList.forEach(person -> System.out.println(person)));
        returned_string.append("]");

        return returned_string;
    }
}
