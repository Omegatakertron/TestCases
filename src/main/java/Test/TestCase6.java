package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.HomePage;
import Pages.TestCasesPage;
import org.testng.annotations.Test;

public class TestCase6 extends SuperTest {

    @Test
    public void testTestCase6(){
        HomePage hp = new HomePage();
        TestCasesPage tcp = new TestCasesPage();

        //Launch the url- https://auutomationexercise.com/
        //Validate title of the page as "AutomationExercise"
        Validations.titleId("Automation Exercise");

        //Click on "TestCases" button
        hp.clickTestCases();

        //Validate text "Below is the list of test Cases for you to practice the Automation. Click on the scerario for detailed TestSteps: "is present
        Validations.validateElementText(tcp.spanInformationLbl, "Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:");

        //Print the count of test cases and print the test cases descroptions
        System.out.println("Number of Test Cases: " + tcp.numberOfTestCases());
        tcp.printTestCasesDescriptions();

        //close the browser





    }

}
