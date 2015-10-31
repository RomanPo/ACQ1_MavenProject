package Tests;


import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Роман
 * Date: 14.10.15
 * Time: 19:58
 * To change this template use File | Settings | File Templates.
 */
public class TestRegistration extends Fixture {


    @Test

    public void testRegistrationFormInput() throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        ellos.mainPage.openPage();
        ellos.mainPage.switchToLoginPage();
        ellos.loginPage.fillRegistrationFirst();
        ellos.loginPage.fillRegistrationFirstConfirm();
        ellos.loginPage.fillRegistrationPassword();
        ellos.loginPage.fillRegistrationPasswordConfirm();

        ellos.loginPage.pressRegistrationButton();

    }


}


