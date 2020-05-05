package ch.cbfs.core.domain.service;

import ch.cbfs.core.domain.model.Person;
import ch.cbfs.core.domain.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

    public List<Person> getAllPersonsUpperCase() {
        List<Person> uppercasePersons = new ArrayList<>();
        List<Person> persons = personRepository.findAll();
        for (Person person : persons) {
//            Person p = new Person(person.getId(), toUppercaseService.toUppercase(person.getName()));
//            uppercasePersons.add(p);
        }
        return uppercasePersons;
    }

}
