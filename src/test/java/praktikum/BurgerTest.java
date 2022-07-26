package praktikum;

import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;



public class BurgerTest {

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @Description("Get the price of a burger (add, remove and move ingredients)")
    public void testMoveIngredientReturnPriceBurger() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(0, 1);
        burger.removeIngredient(1);
        Mockito.when(bun.getPrice()).thenReturn(10f);
        Mockito.when(ingredient.getPrice()).thenReturn(5f);
        assertEquals(25, burger.getPrice(), 0);
    }

    @Test
    @Description("Get a burger check")
    public void testGetReceiptBurger() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn("Sesame bun");
        Mockito.when(ingredient.getType()).thenReturn(SAUCE, FILLING);
        Mockito.when(ingredient.getName()).thenReturn("Creamy", "Cutlet");
        Mockito.when(ingredient.getPrice()).thenReturn(10f);
        String result = "(==== Sesame bun ====)\r\n"
                + "= sauce Creamy =\r\n"
                + "= filling Cutlet =\r\n"
                + "(==== Sesame bun ====)\r\n"
                + "\r\n" + "Price: 20,000000\r\n";
        assertEquals(result, burger.getReceipt());
    }

    @After
    public void end() {
        System.out.println("All the tests are executed");
    }
}
