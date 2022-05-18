package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _09_Locator_linkText_partialLinkText {
    public static void main(String[] args) {
    /*
    Go to https://www.google.com
    Validate the Gmail, Images, About and Store links are displayed and enabled
     */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        System.out.println(gmail.isDisplayed() && gmail.isEnabled() ? "Gmail validation is PASSED" : "Gmail validation is FAILED");

        WebElement images = driver.findElement(By.linkText("Images"));
        System.out.println(images.isDisplayed() && images.isEnabled() ? "Images validation is PASSED" : "Images validation is FAILED");

        WebElement about = driver.findElement(By.partialLinkText("bout"));
        System.out.println(about.isDisplayed() && about.isEnabled() ? "About validation is PASSED" : "About validation is FAILED");

        WebElement store = driver.findElement(By.linkText("Store"));
        System.out.println(store.isDisplayed() && store.isEnabled() ? "Store validation is PASSED" : "Store validation is FAILED");

        System.out.println(gmail.getText());
        System.out.println(images.getText());
        System.out.println(about.getText());
        System.out.println(store.getText());

        Driver.quitDriver();

    }
}
