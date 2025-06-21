package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.AccountCreatedPage;
import Pages.HomePage;
import Pages.LogInPage;
import Pages.SingUpPage;
import org.testng.annotations.Test;

public class TestCase3 extends SuperTest {

    @Test
    public void testTestCase3(){
        HomePage hp = new HomePage();
        LogInPage lp = new LogInPage();
        SingUpPage sp = new SingUpPage();
        AccountCreatedPage acp = new AccountCreatedPage();

        //Validate the title
        Validations.titleId("Automation Exercise");

        //click on SingUp/Login
        hp.clickLogIn();

        //Validate text "New User Signup!" is present
        Validations.validateElementText(lp.newUserLbl, "New User Signup!");

        //enter name
        lp.name("Juan");

        //enter email address
        lp.singUpEmailInput("ju@n.com");

        //click on Signup button
        lp.clickSingUp();

        //Validate text "Enter Account Information"
        Validations.validateElementText(sp.EnterInfoLbl, "ENTER ACCOUNT INFORMATION");

        //fill out all the mandatory details
        sp.password("123");
        sp.firstName("Juan");
        sp.lastName("Dominguez");
        sp.address("Testing St");
        sp.selectCountry("Canada");
        sp.state("Quebec");
        sp.city("Quebec");
        sp.zipCode("99945");
        sp.mobileNumber("3522254789");

        //click on "Create Account" button
        sp.clickCreateAccountBtn();

        //Verify the text "Account Created!"
        Validations.validateElementText(acp.accountCreatedLbl, "ACCOUNT CREATED!");

        //Click on continue button
        acp.clickContinueBtn();

        //close the browser


    }

}
