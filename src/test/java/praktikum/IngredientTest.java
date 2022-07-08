package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    @Mock
    Ingredient newIngredient;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    public void testGetPriceReturnPriceIngredient() {
        when(newIngredient.getPrice()).thenReturn(10F);
        assertEquals(10, newIngredient.getPrice(), 0);
    }

    @Test
    public void testGetNameReturnNameIngredient() {
        when(newIngredient.getName()).thenReturn("Чили");
        assertEquals("Чили", newIngredient.getName());

    }

    @Test
    public void testGetTypeReturnTypeIngredientSAUCE() {
        when(newIngredient.getType()).thenReturn(SAUCE);
        assertEquals(SAUCE, newIngredient.getType());
    }


}
