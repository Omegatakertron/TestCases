package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    @FindBy(xpath = "//td[@class=\"cart_description\"]//p")
    private WebElement descriptionLbl;

    @FindBy(xpath = "//td[@class=\"cart_price\"]//p")
    private WebElement priceLbl;

    @FindBy(xpath = "//td[@class=\"cart_quantity\"]//button")
    private WebElement quantityLbl;

    @FindBy(xpath = "//b[text()=\"Total Amount\"]/parent::h4/parent::td//following-sibling::td//p[@class=\"cart_total_price\"]")
    private WebElement totalAmountLbl;

    @FindBy(xpath = "//textarea[@name=\"message\"]")
    private WebElement commentInput;

    @FindBy(xpath = "//a[text()=\"Place Order\"]")
    private WebElement placeOrderBtn;

    @FindBy(xpath = "//h2[text()=\"Review Your Order\"]")
    public WebElement reviewOrderLbl;

    public CheckoutPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("CheckOut");
    }

    public void printDetails(){
        //Idk if its printed via console or report .getText()
        System.out.print(
                "Description: " + descriptionLbl.getText() + "\n" +
                "Price: " + priceLbl.getText() + "\n" +
                "Quantity: " + quantityLbl.getText() + "\n" +
                "Total Amount: : " + totalAmountLbl.getText() + "\n"
        );
    }

    public void comment(String cmnt){
        commentInput.sendKeys(cmnt);
        SuperTest.captureScreenshot("Checkout");
    }

    public void clickPlaceOrderBtn(){
        placeOrderBtn.click();
        SuperTest.captureScreenshot("Checkout");
    }
}
