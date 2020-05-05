package ch.cbfs.core.domain;

import ch.cbfs.core.config.CoreProperties;
import ch.cbfs.core.domain.model.Person;
import ch.cbfs.core.domain.service.PersonService;
import ch.cbfs.core.random.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    private RandomNumberService randomNumberService;

    @Autowired
    CoreProperties coreProperties;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPersons();
    }

    @GetMapping(value = "/flip")
    public void flip() {
        int result = randomNumberService.flipCoin();
        System.out.println(result);
    }
}
