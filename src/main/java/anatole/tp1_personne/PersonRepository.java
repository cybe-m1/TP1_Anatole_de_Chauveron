package anatole.tp1_personne;

import java.util.List;

public interface PersonRepository {
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
    Person get(int id);

    /**
     * Get a single person by name.
     * @param nom
     * @return
     */
    Person get_by_name(String nom);

    /**
     * Get a signale person by firstname.
     * @param prenom
     * @return
     */
    Person get_by_firstname(String prenom);

    /**
     * Create a new person.
     * @param personne
     */
    void create(Person personne);

    /**
     * Delete a person.
     * @param personne
     */
    void delete(Person personne);

    /**
     * Update a person.
     * @param personne
     */
    void update(Person personne);
}
