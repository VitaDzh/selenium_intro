package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) { // means if there is no driver object, create one
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.manage().deleteAllCookies(); // we want to delete all used password and id's, if not we can meet
            // an issue: we would say program to login, but it would be already logged in
            driver.quit();
            driver = null; // make sure driver is null!!! we definately quit it
        }
    }




}
