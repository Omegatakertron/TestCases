package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TestCasesPage {

    //Find how to get all the divs and make a for loop to get his descrtiption
    @FindAll({@FindBy(xpath = "//div[contains(@class, \"panel-heading\") and contains(.,\"Test Case\")]")})
    private List<WebElement> testCasesList;

    @FindBy(xpath = "//span[contains(., \"Below is \")]")
    public WebElement spanInformationLbl;

    public TestCasesPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("TestCases");
    }

    public int numberOfTestCases(){
        return testCasesList.size();
    }

    public void printTestCasesDescriptions(){
        System.out.println("Voy");
    }


}
