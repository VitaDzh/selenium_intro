package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class _04_Locator_ClassName {
    //Go to Google.com. Make sre image is displayed
    public static void main(String[] args) {
        //1.Set Driver
        WebDriver driver = Driver.getDriver();
        //2. Validation
        driver.get("https://www.google.com/");

        //3.Make sure that image is displayed
        WebElement googleImage = driver.findElement(By.className("lnXdpd"));
        if(googleImage.isDisplayed()) System.out.println("Google image validation is PASSED");
        else System.out.println("Google image validation is FAILED");
        Driver.quitDriver();
    }
}
