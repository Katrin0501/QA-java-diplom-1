package praktikum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)


public class PriceBurgerParamTest {

    private final float priceBun;
    private final float priceIngredient;
    private final float expected;

    public PriceBurgerParamTest(float priceBun, float priceIngredient, float expected) {
        this.priceBun =priceBun;
        this.priceIngredient = priceIngredient;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] Price() {
        return new Object[][] {
                { 5, 5, 15},
                { 1, 5, 7},
                {10, 12, 32},
                {0, 0, 0}
        };
    }

    @Test
    public void N(){
        Burger burger = new Burger();
        burger.setBuns(new Bun("Fluffy bun",priceBun));
        burger.addIngredient(new Ingredient(SAUCE, "Spicy",priceIngredient));
        assertEquals(expected, burger.getPrice(), 0);
    }

}
