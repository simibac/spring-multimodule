package org.baeldung.person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {CoreTestConfiguration.class, PersonService.class})

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class PersonServiceIntegrationTest {
    @Autowired
    private PersonService personService;

    @Before
    public void setup(){}

    @Test
    public void flyway_migrations_initial_data_pass() {
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
