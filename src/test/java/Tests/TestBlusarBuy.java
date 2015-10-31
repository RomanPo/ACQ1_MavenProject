package Tests;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 23.10.15
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class TestBlusarBuy extends Fixture {

    @Test
    public void testAddtoBasket() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException, InterruptedException {
        ellos.mainPage.openPage();
        ellos.mainPage.clickBlusarLink();
        ellos.blusarPage.clickOnBlusarImage();
        ellos.blusarPage.chooseBlusarSize();
        ellos.blusarPage.clickAddtoBasketButton();

    }
}
