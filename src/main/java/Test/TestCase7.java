package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase7 extends SuperTest {

    @Test
    public void testTestCase7(){
        HomePage hp = new HomePage();
        CartPage cp = new CartPage();
        CheckoutPage cop = new CheckoutPage();
        PaymentPage pp = new PaymentPage();
        ProductsPage prodP = new ProductsPage();
        LogInPage lp = new LogInPage();
        CategoryProductPage cpp = new CategoryProductPage();

        //Launch the url - https://auttomationexercise.com/
        //Validate title of the pageas "AutomationExercise"
        Validations.titleId("Automation Exercise");


        //Some Logic to add product to the cart
        //Make a LogIn
        hp.clickLogIn();
        lp.emailAddress("as@as.com");
        lp.password("as");
        lp.clickLogIn();

        //Add a product to cart
        hp.clickProducts();
        prodP.clickWomenBtn();
        prodP.clickdressBtn();
        cpp.clickAddToCartBtn();
        cpp.clickContinueShoppingBtn();

        //Click on Cart" button
        hp.clickCart();

        //Validate "Proceed to check out"  button is present
        Validations.validateElementPresent(By.xpath("//a[text()=\"Proceed To Checkout\"]"), true);

        //Click on  "Proceed to checkout"  button
        cp.clickProceedBtn();

        //Verify the text "Review Your Order"
        Validations.validateElementText(cop.reviewOrderLbl, "Review Your Order");

        //Print Description, Price, Quantity and total Amunt
        cop.printDetails();

        //Enter the comments
        cop.comment("Some comment");

        //Click on "Place Order'
        cop.clickPlaceOrderBtn();

        //Validate "Pay and Confirm Order" button is enabled
        Validations.validateElementEnabled(pp.confirmOrderBtn, true);

        //close the browser


    }
}
