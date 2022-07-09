package praktikum;

import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)


public class BurgerTest {

    Burger burger;

    @Before
    public void setup() {
        burger = new Burger();
        burger.setBuns(new Bun("", 5));

    }


    @Test
    public void testMoveIngredientReturnPriceBurger() {
        burger.addIngredient(new Ingredient(SAUCE, "", 5));
        burger.addIngredient(new Ingredient(FILLING, "", 5));
        burger.moveIngredient(0,1);
        assertEquals(20, burger.getPrice(), 0);

    }

    @Test
    public void testRemoveIngredientReturnPriceBurger() {
        burger.addIngredient(new Ingredient(SAUCE, "", 5));
        burger.addIngredient(new Ingredient(FILLING, "", 5));
        burger.removeIngredient(0);
        assertEquals(15, burger.getPrice(), 0);

    }


}
