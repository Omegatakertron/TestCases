package Pages;

import Common.SuperTest;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(xpath = "//a[text()=\"Proceed To Checkout\"]")
    public WebElement proceedBtn;

    public CartPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("Cart");
    }

    public void clickProceedBtn(){
        proceedBtn.click();
        SuperTest.captureScreenshot("Cart");
    }
}
