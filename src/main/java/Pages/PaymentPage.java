package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(xpath = "//button[contains(.,\"Confirm\")]")
    public WebElement confirmOrderBtn;

    public PaymentPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("Payment");
    }
}
