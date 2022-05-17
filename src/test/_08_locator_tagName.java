package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_locator_tagName {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/
        Validate the WIKIPEDIA heading1 is displayed
        Validate the WIKIPEDIA LOGO is displayed
        Validate the search input box is displayed
        Validate the search button is displayed
        Validate the search button is enabled
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement heading = driver.findElement(By.tagName("h1")); // driver.findElement(by.xpath("//h1"))
        WebElement logo = driver.findElement(By.cssSelector("div[data-el-section='primary links']")); // (".central-featured-logo")
        WebElement inputBox = driver.findElement(By.id("searchInput")); // (".#searchInput") - just for practice
        //WebElement searchButton = driver.findElement(By.cssSelector("i[data-jsl10n='search-input-button']"));
        WebElement searchButton = driver.findElement(By.className("pure-button"));

        System.out.println(heading.isDisplayed()); // true
        System.out.println(heading.getText()); //

        System.out.println(logo.isDisplayed()); // true
        System.out.println(inputBox.isDisplayed()); // true
        System.out.println(searchButton.isDisplayed()); // true
        System.out.println(searchButton.isEnabled()); // true  //only with clickable elements

        Driver.quitDriver();






    }
}
