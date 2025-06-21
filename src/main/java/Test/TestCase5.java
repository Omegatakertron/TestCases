package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class TestCase5 extends SuperTest {

    @Test
    public void testTestCase5(){
        HomePage hp = new HomePage();
        ContactUsPage cup = new ContactUsPage();


        //Launch the url -https://automationexercise.com/

        //Validate title of the page as "AutomationExercise"
        Validations.titleId("Automation Exercise");

        //Click on "ContactUs" button
        hp.clickContact();

        //Validate text "Contact Us" is present
        Validations.validateElementText(cup.contactUsLbl, "CONTACT US");

        //Enter name, email, subject, message
        cup.name("Robert");
        cup.email("rob@bert.com");
        cup.subject("Testing this page");
        cup.message("Massive text");

        //Upload a file
        cup.chooseFile("C:\\Users\\luism\\IdeaProjects\\TestCases1\\File\\Test.txt");

        //Click on "Submit"
        //Click "OK” if the alert appears
        cup.clickSubmit();

        //Validate the text "Success! Your details have been submitted successfully."
        Validations.validateElementText(cup.successLbl, "Success! Your details have been submitted successfully.");

        //close the browser


    }


}
