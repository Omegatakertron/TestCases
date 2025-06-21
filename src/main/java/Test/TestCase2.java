package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.HomePage;
import Pages.LogInPage;
import org.testng.annotations.Test;

public class TestCase2 extends SuperTest {

    @Test
    public void testTestCase2(){
        HomePage hp = new HomePage();
        LogInPage lp = new LogInPage();

        //Validate the title
        Validations.titleId("Automation Exercise");

        //click on SingUp/Login
        hp.clickLogIn();

        //Validate text "Login to your account" is present
        Validations.validateElementText(lp.loginLbl,"Login to your account" );

        //Enter User name
        lp.emailAddress("ask@as.com");

        //enter password
        lp.password("ask");

        //Click on login
        lp.clickLogIn();

        //Validate error message as "Your email or password is incorrect!"
        Validations.validateElementText(lp.InValidErrorMsg, "Your email or password is incorrect!");
    }
}
