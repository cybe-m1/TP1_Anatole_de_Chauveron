package anatole.tp1_personne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tp1/persons")
public class PersonController {
    private final PersonService person_service;

    @Autowired
    public PersonController(PersonService person_service) {
        this.person_service = person_service;
    }

    @GetMapping
    public List<Person> listOfAllPersons() {
        return person_service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable int id) {
        return person_service.get(id);
    }

    @PostMapping
    public void createPerson(@RequestBody Person person) {
        person_service.create(person);
    }

    @PutMapping
    public void updatePerson(@RequestBody Person person) {
        person_service.update(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable int id) {
        person_service.delete(id);
    }
}
