package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(partialLinkText = "Signup / Login")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[text()=\" Logout\"]")
    private WebElement logoutBtn;

    @FindBy(xpath = "(//h1[text()=\"Exercise\"]//span[text()=\"Automation\"])[1]")
    private WebElement welcomeTxt;

    @FindBy(xpath = "//a[text()=\" Products\"]")
    private WebElement productsBtn;

    @FindBy(xpath = "//a[text()=\" Contact us\"]")
    private WebElement contactBtn;

    @FindBy(xpath = "//a[text()=\" Test Cases\"]")
    private WebElement testCasesBtn;

    @FindBy(xpath = "//a[text()=\" Cart\"]")
    private WebElement cartBtn;

    public HomePage(){
        PageFactory.initElements(SuperTest.driver, this);
    }

    public void clickLogIn(){
        loginBtn.click();
    }

    public void clickLogOut(){
        logoutBtn.click();
    }

    public void clickProducts(){
        productsBtn.click();
    }

    public void clickContact(){
        contactBtn.click();
    }

    public void clickTestCases(){
        testCasesBtn.click();
    }

    public void clickCart(){
        cartBtn.click();
    }
}
