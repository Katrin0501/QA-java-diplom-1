package praktikum;

import jdk.jfr.Description;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;


public class IngredientTypeTest {

    @Test
    @Description("ingredientType - SAUCE")
    public void testEnumSouse() {
        assertEquals(IngredientType.valueOf("SAUCE"), SAUCE);
    }

    @Test
    @Description("ingredientType - FILLING")
    public void testEnumFilling() {
        assertEquals(IngredientType.valueOf("FILLING"), FILLING);
    }
}
