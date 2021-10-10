package anatole.tp1_personne;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {
    /**
     * Get the list of all persons registered
     * @return
     */
    List<Person> getAll();

    /**
     * Get a single person by id.
     * @param id
     * @return
     */
    Optional<Person> get(int id);

    /**
     * Get a single person by name.
     * @param name
     * @return
     */
    Optional<Person> get_by_name(String name);

    /**
     * Get a signale person by firstname.
     * @param firstname
     * @return
     */
    Optional<Person> get_by_firstname(String firstname);

    /**
     * Create a new person.
     * @param person
     */
    void create(Person person);

    /**
     * Delete a person.
     * @param id
     */
    void delete(int id);

    /**
     * Update a person.
     * @param person
     */
    void update(Person person);
}
