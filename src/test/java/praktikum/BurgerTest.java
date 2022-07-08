package praktikum;

import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {
    @Mock

    Bun bun;
   Ingredient ingredient;
    List<Ingredient> ingredients;


    @Test
    public void testSetBunReturnPrice() {

        Burger burger = new Burger();
        burger.setBuns(new Bun("",6));
     Assert.assertEquals(12,burger.getPrice(),0);

    }

    @Test
    public void testS(){
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(SAUCE,"",5));
        assertEquals(5,burger.getPrice());


    }
}
