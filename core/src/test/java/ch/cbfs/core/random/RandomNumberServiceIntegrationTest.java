package ch.cbfs.core.random;

import ch.cbfs.core.config.CoreTestConfig;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = CoreTestConfig.class)
@ContextConfiguration
@TestPropertySource(locations = "classpath:core-test.properties")
public class RandomNumberServiceIntegrationTest {

    @Autowired
    private RandomNumberService randomNumberService;

    @Test
    public void flip_coin_and_get_0_or_1() {
        int result = randomNumberService.flipCoin();
        Assert.assertTrue("Flipped coin not 0 or 1", result == 0 || result == 1);
    }
}
