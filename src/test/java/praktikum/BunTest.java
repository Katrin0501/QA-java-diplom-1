package praktikum;

import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class BunTest {
    @Mock
    Bun newBun;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @Description("Get the name of the bun")
    public void testGetNameReturnNameBun() {
        when(newBun.getName()).thenReturn("Black bun");
        assertEquals("Black bun", newBun.getName());
    }

    @Test
    @Description("Get the price of a bun")
    public void testGetPriceReturnPriceBun() {
        when(newBun.getPrice()).thenReturn(10F);
        assertEquals(10, newBun.getPrice(), 0);
    }

    @After
    public void end() {
        System.out.println("All the tests are executed");
    }
}
