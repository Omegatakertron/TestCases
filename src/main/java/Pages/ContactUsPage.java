package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

    @FindBy(xpath = "//input[@name=\"name\"]")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@name=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@name=\"subject\"]")
    private WebElement subjectInput;

    @FindBy(xpath = "//textarea[@name=\"message\"]")
    private WebElement messageInput;

    @FindBy(xpath = "//input[@type=\"file\"]")
    private WebElement chooseFileInput;

    @FindBy(xpath = "//input[@name=\"submit\"]")
    private WebElement submitBtn;

    @FindBy(xpath = "//h2[text()=\"Contact \"]")
    public WebElement contactUsLbl;

    @FindBy(xpath = "(//div[contains(text(), \"Success! Your details\")])[1]")
    public WebElement successLbl;

    public ContactUsPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("ContactUs");
    }

    public void name(String nm){
        nameInput.sendKeys(nm);
        SuperTest.captureScreenshot("ContactUs");
    }

    public void email(String ml){
        emailInput.sendKeys(ml);
        SuperTest.captureScreenshot("ContactUs");
    }

    public void subject(String sbjct){
        subjectInput.sendKeys(sbjct);
        SuperTest.captureScreenshot("ContactUs");
    }

    public void message(String mssg){
        messageInput.sendKeys(mssg);
        SuperTest.captureScreenshot("ContactUs");
    }

    public void chooseFile(String pathToFile){
        chooseFileInput.sendKeys(pathToFile);
        //Code to select a file
        SuperTest.captureScreenshot("ContactUs");
    }

    public void clickSubmit(){
        submitBtn.click();
        SuperTest.driver.switchTo().alert().accept();
        SuperTest.captureScreenshot("ContactUs");

    }

}
