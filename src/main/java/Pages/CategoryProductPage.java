package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryProductPage {

    @FindBy(xpath = "(//a[text()=\"Add to cart\"])[1]")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//button[text()=\"Continue Shopping\"]")
    private WebElement continueShoppingBtn;

    @FindBy(xpath = "//p[text()=\"Your product has been added to cart.\"]")
    public WebElement productAddesLbl;

    public CategoryProductPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("CategoryProduct");
    }

    public void clickAddToCartBtn(){
        addToCartBtn.click();
        SuperTest.captureScreenshot("CategoryProduct");
    }

    public void clickContinueShoppingBtn(){
        continueShoppingBtn.click();
        SuperTest.captureScreenshot("CategoryProduct");
    }
}
