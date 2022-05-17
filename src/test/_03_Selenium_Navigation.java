package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _03_Selenium_Navigation {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");
        driver.navigate().refresh();
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        String expectedTitle = driver.getTitle();
        String expectedlURL = driver.getCurrentUrl();

        String actualTitle = driver.getTitle();
        String actuallURL = driver.getCurrentUrl();

        if(actualTitle.equals(expectedTitle)) System.out.println("Passed");
        else System.out.println("Failed");

        if(actuallURL.equals(expectedlURL)) System.out.println("Passed");
        else System.out.println("Failed");

        Driver.quitDriver();


    }
}
