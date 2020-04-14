package org.baeldung;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    // private final PersonDao personDao;
    private final PersonRepository personRepository;
    private final ToUppercaseService toUppercaseService;
    private final RandomNumberService randomNumberService;

    @Autowired
    public PersonService(PersonRepository personRepository, ToUppercaseService toUppercaseService, RandomNumberService randomNumberService){
        this.personRepository = personRepository;
        this.toUppercaseService = toUppercaseService;
        this.randomNumberService = randomNumberService;
    }

    public List<Person> getAllPerson() {
        List<Person> uppercasePersons = new ArrayList<>();
        List<Person> persons = personRepository.findAll();
        for (Person person:persons){
            Person p = new Person(person.getId(), toUppercaseService.toUppercase(person.getName()));
            uppercasePersons.add(p);
        }
        return uppercasePersons;
    }

    public Boolean playCoinFlip(){
        return true;
    }
}
