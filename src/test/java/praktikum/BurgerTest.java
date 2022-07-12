package praktikum;


import jdk.jfr.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;


public class BurgerTest {

    Burger burger;

    @Before
    public void setup() {
        burger = new Burger();
        burger.setBuns(new Bun("Sesame bun", 5));

    }


    @Test
    @Description("Get the price of a burger (add, remove and move ingredients)")
    public void testMoveIngredientReturnPriceBurger() {
        burger.addIngredient(new Ingredient(SAUCE, "Chile", 3));
        burger.addIngredient(new Ingredient(FILLING, "Cutlet", 5));
        burger.moveIngredient(0, 1);
        burger.removeIngredient(1);
        burger.addIngredient(new Ingredient(SAUCE, "Cheesy", 2));
        assertEquals(17, burger.getPrice(), 0);

    }


    @Test
    @Description("Get a burger check")
    public void testGetReceiptBurger() {
        burger.addIngredient(new Ingredient(SAUCE, "Creamy", 5));
        burger.addIngredient(new Ingredient(FILLING, "Cutlet", 5));
        String result = "(==== Sesame bun ====)\r\n"
                + "= sauce Creamy =\r\n"
                + "= filling Cutlet =\r\n"
                + "(==== Sesame bun ====)\r\n"
                + "\r\n" + "Price: 20,000000\r\n";
        assertEquals(result, burger.getReceipt());

    }

    @After
    public  void end() {
        System.out.println("All the tests are executed");

    }
}
