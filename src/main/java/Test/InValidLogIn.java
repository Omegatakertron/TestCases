package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.HomePage;
import Pages.LogInPage;
import org.testng.annotations.Test;

public class InValidLogIn extends SuperTest {

    @Test
    public void testInValidLogIn(){
        HomePage hp = new HomePage();
        LogInPage lp = new LogInPage();

        //Validate the title
        Validations.titleId("Automation Exercise");

        //Validate Log In text
        Validations.validateElementText(lp.logInAccount, "Signup / Login");

        //Validate LogIn Btn
        hp.clickLogIn();
        lp.emailAddress("ValidMail@mail.com");
        lp.password("Test1234");
        lp.clickLogIn();

        Validations.validateElementText(lp.InValidErrorMsg, "Your email or password is incorrect!");
    }

}
