package praktikum;

import jdk.jfr.Description;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

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
    @Description("Get Ingredient Price")
    public void testGetPriceReturnPriceIngredient() {
        when(newIngredient.getPrice()).thenReturn(10F);
        assertEquals(10, newIngredient.getPrice(), 0);
    }

    @Test
    @Description("Get Ingredient Name")
    public void testGetNameReturnNameIngredient() {
        when(newIngredient.getName()).thenReturn("Yummy");
        assertEquals("Yummy", newIngredient.getName());

    }

    @Test
    @Description("Get Ingredient Type")
    public void testGetTypeReturnTypeIngredientSAUCE() {
        when(newIngredient.getType()).thenReturn(SAUCE);
        assertEquals(SAUCE, newIngredient.getType());
    }


}
