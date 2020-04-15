package org.baeldung.person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BackendTestConfiguration.class, PersonService.class})

// TestPropertySource cannot be in BackendTestConfiguration
@TestPropertySource(locations = "classpath:test.properties")
public class PersonServiceIntegrationTest {
    @Autowired
    private PersonService personService;

    // PersonRepository is already part of the application context
    // @Autowired
    // private PersonRepository personRepository;

    // We can initialize a specific repository implementation.
    // If we don't define it, it will use the application.properties to locate jpa definitions
     @Autowired
//     @Qualifier("h2-impl")
     private PersonRepository personRepository;

    @Before
    public void setup(){}

    @Test
    public void flyway_migrations_initial_data_pass() {
        Assert.assertTrue(true);
        List<Person> persons = personService.getAllPerson();
        Assert.assertEquals(4, persons.size());
    }

    @Test
    public void touppercase_service_pass() {
        Assert.assertTrue(true);
        List<Person> persons = personService.getAllPerson();
        Assert.assertEquals("MARC", persons.get(0).getName());
    }
}
