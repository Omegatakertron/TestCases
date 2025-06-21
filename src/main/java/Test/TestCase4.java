package Test;

import Common.SuperTest;
import Common.Validations;
import Pages.CategoryProductPage;
import Pages.HomePage;
import Pages.ProductsPage;
import org.testng.annotations.Test;

public class TestCase4 extends SuperTest {

    @Test
    public void testTestCase4(){
        HomePage hp = new HomePage();
        ProductsPage pp = new ProductsPage();
        CategoryProductPage cpp = new CategoryProductPage();



        //Launch the ur|- https://automationexercise.com/


        //Validate title of the page as "'Automation Exercise"
        Validations.titleId("Automation Exercise");

        //Click on "Products" button
        hp.clickProducts();

        //Validate text "All Products" is present
        Validations.validateElementText(pp.allProductsLbl, "ALL PRODUCTS");

        //Click on "Women" + button under category
        pp.clickWomenBtn();

        //click on Dress
        pp.clickdressBtn();

        //Click on "Add Cart" button of first product
        cpp.clickAddToCartBtn();

        //Validate text "Your product has been added to cart."
        Validations.validateElementText(cpp.productAddesLbl, "Your product has been added to cart.");

        //Click on "Continue Shopping"
        cpp.clickContinueShoppingBtn();

        //close the browse



    }


}
