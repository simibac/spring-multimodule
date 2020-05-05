package ch.cbfs.foundation.domain;

import ch.cbfs.foundation.config.FoundationTestConfig;
import ch.cbfs.foundation.domain.model.Foundation;
import ch.cbfs.foundation.domain.service.FoundationService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest(classes = FoundationTestConfig.class)
@ContextConfiguration
@TestPropertySource(locations = "classpath:foundation-test.properties")
public class FoundationServiceIntegrationTest {

    @Autowired
    private FoundationService foundationService;

    @Test
    @Transactional
    public void testFoundationWithId1FromDB() {
        Foundation foundation = foundationService.getFoundation(1L);

        Assert.assertNotNull(foundation);
        Assert.assertEquals("Disneyland Foundation", foundation.getName());
        Assert.assertEquals("Marc", foundation.getPerson().getName());
    }

    @Test
    public void testAllFoundationsFromDB() {
        List<Foundation> foundations = foundationService.getAllFoundations();

        Assert.assertNotNull(foundations);
        Assert.assertEquals(2, foundations.size());
    }

    @Test
    public void testFoundationsNameUppercaseFromDB() {
        List<Foundation> foundations = foundationService.getAllFoundationsNameUppercase();

        Assert.assertNotNull(foundations);
        Assert.assertEquals(2, foundations.size());
        Assert.assertEquals("DISNEYLAND FOUNDATION", foundations.get(0).getName());
        Assert.assertEquals("ROGER FEDERER FOUNDATION", foundations.get(1).getName());
    }

}
