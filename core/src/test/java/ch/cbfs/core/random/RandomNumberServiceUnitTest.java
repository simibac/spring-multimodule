package ch.cbfs.core.random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

// Unit test does not need the application context loaded --> much faster
@RunWith(MockitoJUnitRunner.class)
public class RandomNumberServiceUnitTest {

    @Mock
    private RandomNumberService randomNumberService;

    @Before
    public void setup() {
        this.randomNumberService = Mockito.mock(RandomNumberService.class);
        Mockito.when(randomNumberService.flipCoin()).thenReturn(0);
    }

    @Test
    public void flip_coin_and_get_0() {
        Assert.assertEquals(0, randomNumberService.flipCoin());
    }
}
