package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class _10_findElement_vs_findElements {
    public static void main(String[] args) {
        /*
    Go to https://www.google.com
    Validate the Gmail, Images, About and Store links are displayed and enabled
        */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        List<WebElement> googleNavLinks = driver.findElements(By.xpath("//div[@class='o3j99 n1xJcf Ne6nSd']"));

        for (int i = 0; i <= 3; i++) {
            System.out.println(googleNavLinks.get(i).getText());
            System.out.println(googleNavLinks.get(i).isDisplayed() && googleNavLinks.get(i).isEnabled() ? "PASSED" : "FAILED");
        }
        Driver.quitDriver();
    }
}
