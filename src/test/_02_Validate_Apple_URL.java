package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/vitayuzko/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        System.out.println(driver.getCurrentUrl().equals("https://www.apple.com/") ? "URL is PASSED" : "URL is FAILED" );
        Driver.quitDriver();


    }
}
