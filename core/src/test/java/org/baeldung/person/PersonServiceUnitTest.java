package org.baeldung.person;

import org.baeldung.ToUpperase.ToUppercaseServiceImpl;
import org.baeldung.random.RandomNumberService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

// Unit test does not need the application context loaded --> much faster
@RunWith(MockitoJUnitRunner.class)
public class PersonServiceUnitTest {
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Mock
    private RandomNumberService randomNumberService;

    @Before
    public void setup(){
        Person person = new Person(1, "Simon");
        List<Person> personList = new ArrayList<>();
        personList.add(person);

        this.personRepository = Mockito.mock(PersonRepository.class);
        this.randomNumberService = Mockito.mock(RandomNumberService.class);
        Mockito.when(personRepository.findAll()).thenReturn(personList);
        this.personService = new PersonService(personRepository, new ToUppercaseServiceImpl(), randomNumberService);
    }

    @Test
    public void find_all_person_ok() {
        List<Person> persons = personService.getAllPerson();
        Assert.assertEquals(1, persons.size());
    }
}