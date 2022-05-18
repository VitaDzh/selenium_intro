package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _12_sendKeys_clickMethods {
    public static void main(String[] args) {

        /*
        Go to https://www.wikipedia.org/
        Search for "Tesla"
        Validate the main title of the page is "Tesla"
        NOTE: Use xpath or cssSelector to locate the web elements
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement searchInputBox = driver.findElement(By.cssSelector("#searchInput"));
       // WebElement button = driver.findElement(By.cssSelector(".pure-button"));

      //  searchInputBox.sendKeys("tesla");
        searchInputBox.sendKeys("tesla" + Keys.ENTER);
      //  button.click();

        WebElement title = driver.findElement(By.xpath("//h1[@id='firstHeading']"));
        System.out.println(title.isDisplayed() && title.getText().equals("Tesla"));

        Driver.quitDriver();



    }
}
