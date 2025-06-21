package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingUpPage {

    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement passInput;

    @FindBy(xpath = "//input[@id=\"first_name\"]")
    private WebElement firtsNameInput;

    @FindBy(xpath = "//input[@id=\"last_name\"]")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id=\"address1\"]")
    private WebElement addressInput;

    @FindBy(xpath = "//select[@id=\"country\"]")
    private WebElement countryDropdown;

    @FindBy(xpath = "//input[@id=\"state\"]")
    private WebElement stateInput;

    @FindBy(xpath = "//input[@id=\"city\"]")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@id=\"zipcode\"]")
    private WebElement zipCodeInput;

    @FindBy(xpath = "//input[@id=\"mobile_number\"]")
    private WebElement mobileNumberInput;

    @FindBy(xpath = "//button[text()=\"Create Account\"]")
    private WebElement createAccountBtn;

    @FindBy(xpath = "//b[text()=\"Enter Account Information\"]")
    public WebElement EnterInfoLbl;

    public SingUpPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("LogIn");
    }

    public void password(String pass){
        passInput.sendKeys(pass);
        SuperTest.captureScreenshot("SingUp");
    }

    public void firstName(String fName){
        firtsNameInput.sendKeys(fName);
        SuperTest.captureScreenshot("SingUp");
    }

    public void lastName(String lName){
        lastNameInput.sendKeys(lName);
        SuperTest.captureScreenshot("SingUp");
    }

    public void address(String addrs){
        addressInput.sendKeys(addrs);
        SuperTest.captureScreenshot("SingUp");
    }

    public void selectCountry(String country){
        Select slctCountry = new Select(countryDropdown);
        slctCountry.selectByValue(country);
        SuperTest.captureScreenshot("SingUp");
    }

    public void state(String stt){
        stateInput.sendKeys(stt);
        SuperTest.captureScreenshot("SingUp");
    }

    public void city(String cty){
        cityInput.sendKeys(cty);
        SuperTest.captureScreenshot("SingUp");
    }

    public void zipCode(String zpCde){
        zipCodeInput.sendKeys(zpCde);
        SuperTest.captureScreenshot("SingUp");
    }

    public void mobileNumber(String mbleNmbr){
        mobileNumberInput.sendKeys(mbleNmbr);
        SuperTest.captureScreenshot("SingUp");
    }

    public void clickCreateAccountBtn(){
        createAccountBtn.click();
        SuperTest.captureScreenshot("SingUp");
    }
}
