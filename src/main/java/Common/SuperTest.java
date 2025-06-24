package Common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;

public class SuperTest {
    public static WebDriver driver;

    @BeforeMethod
    public void launchUrl(){
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");

        captureScreenshot("Init");

    }

    @AfterMethod
    public void closeAll(){
        driver.quit();
    }

    public static void captureScreenshot(String from){
        SecureRandom random = new SecureRandom();
        int randomNum = 10000 + random.nextInt(9000);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshots/" + from + randomNum + ".png");

        try{
            FileUtils.copyFile(srcFile, destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }






}
