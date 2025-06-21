package Common;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Validations {

    public static void titleId(String expectedTitle){
        String actualTitle = SuperTest.driver.getTitle();
        SuperTest.captureScreenshot("Home");
        Assert.assertEquals(actualTitle, expectedTitle, "Title not match");
    }

    public static void validateElementText(WebElement element, String expectedText){
        String actualtext = element.getText();
        SuperTest.captureScreenshot("Validation");
        Assert.assertEquals(actualtext, expectedText, "Text not match");
    }

    public static void validateElementPresent(By locator, boolean isPresent){
        List<WebElement> elements = SuperTest.driver.findElements(locator);
        boolean actualPresence = elements.size() > 0;
        SuperTest.captureScreenshot("Validation");
        Assert.assertEquals(actualPresence, isPresent, "Element not present");
    }

    public static void  validateElementEnabled(WebElement element, boolean isEnabled){
        boolean actuallyEnabled = element.isEnabled();
        Assert.assertEquals(actuallyEnabled, isEnabled, "Element is not enabled");
    }

}
