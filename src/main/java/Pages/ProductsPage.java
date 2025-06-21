package Pages;

import Common.SuperTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    @FindBy(xpath = "//a[contains(., \"Women\")]//i")
    private WebElement womenBtn;

    @FindBy(xpath = "(//a[text()=\"Dress \"])[1]")
    private WebElement dressBtn;

    @FindBy(xpath = "//h2[text()=\"All Products\"]")
    public WebElement allProductsLbl;

    public ProductsPage(){
        PageFactory.initElements(SuperTest.driver, this);
        SuperTest.captureScreenshot("Products");
    }

    public void clickWomenBtn(){
        womenBtn.click();
        SuperTest.captureScreenshot("Products");
    }

    public void clickdressBtn(){
        dressBtn.click();
        SuperTest.captureScreenshot("Products");
    }

}
