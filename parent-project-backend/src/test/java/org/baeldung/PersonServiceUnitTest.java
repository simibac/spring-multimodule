package org.baeldung;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

// SpringBootTest loads the entire Application context into the test
// @Test must be imported from org.junit.jupiter.api.Test
//@SpringBootTest

// RunWith + ContextConfiguration partially loads the application context
// @Test must imported from org.junit.Test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BackendTestConfiguration.class, PersonService.class})

// TestPropertySource cannot be in BackendTestConfiguration
@TestPropertySource(locations = "classpath:test.properties")
public class PersonServiceUnitTest {

    @Value("${active-profile}")
    private String testString;

    @Autowired
    private PersonService personService;

    // We dont want to use the actual repository and query the db.
    // Thus, we add this mock to the application context.
    @MockBean(name = "h2-impl")
    private PersonRepository personRepository;

    @Autowired
    private RandomNumberService randomNumberService;

    @Before
    public void setup(){
        this.personRepository = Mockito.mock(PersonRepository.class);
        this.personService = new PersonService(personRepository, new ToUppercaseServiceImpl(), randomNumberService);

        Mockito.when(personRepository.findAll()).thenReturn(new ArrayList<Person>());
    }

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        Assert.assertTrue(true);
        List<Person> persons = personService.getAllPerson();
        Assert.assertEquals(0, persons.size());
    }

    @Test
    public void load_test_properties_string_ok(){
        int n = randomNumberService.flipCoin();
        // the value comes from application.properties and NOT from test.properties
        Assert.assertEquals("test-test", testString);

        Assert.assertEquals(0, 0);

    }
}