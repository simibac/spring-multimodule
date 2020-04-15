package org.baeldung.config;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
public class CorePropertiesTest {

    @Autowired
    private CoreProperties coreProperties;

    @Test
    public void load_test_properties_string_ok(){
        Assert.assertEquals("test", coreProperties.activeProfile);
    }
}
