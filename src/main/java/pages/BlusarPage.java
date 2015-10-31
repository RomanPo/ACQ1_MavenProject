package pages;

import utils.WebDriverWrapper;


import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 16.10.15
 * Time: 22:37
 * To change this template use File | Settings | File Templates.
 */
public class BlusarPage extends Page {

    public BlusarPage(WebDriverWrapper driver) throws Exception {
        super(driver);
    }

    public void clickOnBlusarImage() throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, InterruptedException {
       isOpenPage("FirstBlusarimage");
        web.clckLink("FirstBlusarimage");
    }

    public void chooseBlusarSize() throws IOException {
        web.clickButton("ValiStorleDropdown");
        web.clckLink("Size34");

    }

    public void clickAddtoBasketButton() throws IOException {
        web.clickButton("AddtoBasketButton");
    }
}






