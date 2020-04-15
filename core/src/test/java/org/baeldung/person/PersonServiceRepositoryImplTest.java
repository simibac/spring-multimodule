package org.baeldung.person;

import org.baeldung.person.Person;
import org.baeldung.person.PersonRepository;
import org.baeldung.person.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersonServiceRepositoryImplTest {
    @Autowired
    private PersonService personService;

    @Autowired
    @Qualifier("h2-impl")
    private PersonRepository personRepository;

    @Before
    public void setup(){
    }

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        Assert.assertTrue(true);
        List<Person> persons = personService.getAllPerson();
        Assert.assertEquals(0, persons.size());
    }
}
