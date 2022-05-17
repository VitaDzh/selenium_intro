package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/vitayuzko/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver(); // creating instance
        driver.manage().window().maximize(); // maximazing driver
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
        driver.get("https://www.apple.com/"); //go here

        System.out.println(driver.getTitle().equals("Apple") ? "Apple's title validation is PASSED" : "Apple's title validation is FAILED" );
        Driver.quitDriver();
        /*
        String actualTitle = driver.getTitle(); // from requirements
        String actualTitle = driver.getTitle(); // from application under development
         */

    }
}
