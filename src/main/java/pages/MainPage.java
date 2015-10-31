package pages;


import utils.PropertyLoader;
import utils.WebDriverWrapper;

import java.io.IOException;

/**
 * Created by lavi on 10/16/2015.
 */
public class MainPage extends Page{

    private static final String MAIN_PAGE = PropertyLoader.loadProperty("site.url");


    public MainPage(WebDriverWrapper driver) {
        super(driver, MAIN_PAGE);
    }

    public void clickLogo() throws IOException {
        web.clckLink("Logo");
    }

    public void switchToLoginPage() throws IOException {
        web.clckLink("LoginPageLink");

        if (web.isElementPresent("EmailField")) {
            log.info("SwitchTo Login Page was correct");
        } else {
            log.error("SwitchTo Login Page was Incorrect");
        }
    }
      public void clickKaporLink() throws IOException {
          web.clckLink("KaporJeansLink");
         if(web.isElementPresent("CartLink")){
             log.info(("Switched to KapporPage"));
         }else {
             log.error("Failed");
         }
      }

    public void clickBlusarLink() throws IOException {
        try {
            web.clckLink("BlusarLink");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        System.out.println("Pressed");
    }
}
