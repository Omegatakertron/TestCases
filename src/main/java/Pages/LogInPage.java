package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    //email field
    @FindBy (xpath = "(//input[@name=\"email\"])[1]")
    private WebElement emailInput;

    //password field
    @FindBy (xpath = "//input[@name=\"password\"]")
    private WebElement passwordInput;

    //logIn button
    @FindBy (xpath = "//button[text()=\"Login\"]")
    private WebElement loginBtn;

    //logOut button
    @FindBy (xpath = "//a[text()=\" Logout\"]")
    private WebElement logOutBtn;

    //singUp Button
    @FindBy (xpath = "//button[text()=\"Signup\"]")
    private WebElement singupBtn;

    //name field
    @FindBy (xpath = "//input[@name=\"name\"]")
    private WebElement nameInput;

    //sing up mail field
    @FindBy (xpath = "(//input[@name=\"email\"])[2]")
    private WebElement singUpEmailInput;

    //Login to your account text
    @FindBy(xpath = "//h2[text()=\"Login to your account\"]")
    public WebElement loginLbl;

    //New User text
    @FindBy(xpath = "//h2[text()=\"New User Signup!\"]")
    public WebElement newUserLbl;

    //LogIn Text
    @FindBy (xpath = "//a[text()=\" Signup / Login\"]")
    public WebElement logInAccount;

    //LogIn error text
    @FindBy (xpath = "//p[text()=\"Your email or password is incorrect!\"]")
    public WebElement InValidErrorMsg;

    public LogInPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("LogIn");
    }

    public void emailAddress(String mail){
        emailInput.sendKeys(mail);
        SuperTest.captureScreenshot("LogIn");
    }

    public void password(String pass){
        passwordInput.sendKeys(pass);
        SuperTest.captureScreenshot("LogIn");
    }

    public void name(String _name){
        nameInput.sendKeys(_name);
        SuperTest.captureScreenshot("LogIn");
    }

    public void singUpEmailInput(String singUpEmail){
        singUpEmailInput.sendKeys(singUpEmail);
        SuperTest.captureScreenshot("LogIn");
    }

    public void clickSingUp(){
        singupBtn.click();
        SuperTest.captureScreenshot("LogIn");
    }

    public void clickLogIn(){
        loginBtn.click();
        SuperTest.captureScreenshot("LogIn");
    }

    public void clickLogOut(){
        logOutBtn.click();
    }



}
