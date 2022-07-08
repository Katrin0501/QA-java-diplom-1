package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class BunTest {
    @Mock
    Bun newBun;

    @Before
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetNameReturnNameBun(){
        when(newBun.getName()).thenReturn("Звезда");
        assertEquals("Звезда",newBun.getName());

    }

    @Test
    public void testGetPriceReturnPriceBun(){
        when(newBun.getPrice()).thenReturn(10F);
        assertEquals(10,newBun.getPrice(),0);
    }

}
