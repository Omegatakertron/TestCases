package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.HomePage;
import Pages.LogInPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends SuperTest {

    @Test
    public void testTestCase1(){
        HomePage hp = new HomePage();
        LogInPage lp = new LogInPage();

        //Validate the title
        Validations.titleId("Automation Exercise");

        //click on SingUp/Login
        hp.clickLogIn();

        //Validate text "Login to your account" is present
        Validations.validateElementText(lp.loginLbl,"Login to your account" );

        //Enter User name
        lp.emailAddress("as@as.com");

        //enter password
        lp.password("as");

        //Click on login
        lp.clickLogIn();

        //Validate Element "Delete Account"
        Validations.validateElementPresent(By.partialLinkText("Delete Account"), true);

        //Click LogOut
        hp.clickLogOut();

        //Validate Element "Delete Account"
        Validations.validateElementPresent(By.partialLinkText("Delete Account"), false);

    }
}
