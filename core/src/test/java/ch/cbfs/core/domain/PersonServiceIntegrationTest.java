package ch.cbfs.core.domain;

import ch.cbfs.core.config.CoreTestConfig;
import ch.cbfs.core.domain.model.Person;
import ch.cbfs.core.domain.service.PersonService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

@SpringBootTest(classes = CoreTestConfig.class)
@ContextConfiguration
@TestPropertySource(locations = "classpath:core-test.properties")
public class PersonServiceIntegrationTest {

    @Autowired
    private PersonService personService;

    @Test
    public void getAllPersonsFromDB() {
        List<Person> persons = personService.getAllPersons();

        Assert.assertEquals(4, persons.size());
        Assert.assertEquals("Marc", persons.get(0).getName());
        Assert.assertEquals("Michael", persons.get(1).getName());
        Assert.assertEquals("Roland", persons.get(2).getName());
        Assert.assertEquals("Simon", persons.get(3).getName());
    }

//    @Test
//    public void getAllPersonsUpperCaseFromDB() {
//        List<Person> persons = personService.getAllPersonsUpperCase();
//        Assert.assertEquals("MARC", persons.get(0).getName());
//        Assert.assertEquals("MICHAEL", persons.get(0).getName());
//        Assert.assertEquals("ROLAND", persons.get(0).getName());
//        Assert.assertEquals("SIMON", persons.get(0).getName());
//    }
}
