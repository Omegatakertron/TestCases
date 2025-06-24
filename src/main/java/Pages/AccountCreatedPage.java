package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage {

    @FindBy(xpath = "//a[text()=\"Continue\"]")
    private WebElement continueBtn;

    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement accountCreatedLbl;

    public AccountCreatedPage(){
        PageFactory.initElements(SuperTest.driver, this);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }
}
