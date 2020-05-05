package ch.cbfs.core.domain;

import ch.cbfs.core.domain.model.Person;
import ch.cbfs.core.domain.repository.PersonRepository;
import ch.cbfs.core.domain.service.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

// Unit test does not need the application context loaded --> much faster
@RunWith(MockitoJUnitRunner.class)
public class PersonServiceUnitTest {

    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Before
    public void setup() {
        Mockito.when(personRepository.findAll()).thenReturn(Collections.singletonList(new Person(1L, "Simon")));
        this.personService = new PersonService(personRepository);

    }

    @Test
    public void find_all_persons() {
        List<Person> persons = personService.getAllPersons();
        Assert.assertEquals(1, persons.size());
    }
}
