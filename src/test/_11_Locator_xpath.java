package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class _11_Locator_xpath {
    public static void main(String[] args) {

        /*
        Go to https://www.google.com/
        Validate the links below at the bottom-left of the page
        Advertising
        Business
        How Search works
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com/");

        //shift-left testing.
        List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
        String[] expectedLinkTexts = {"Advertising", "Business", "How Search works"};

        for (int i = 0; i < 3; i++) {
            if(allLinks.get(i).isDisplayed() && allLinks.get(i).isEnabled() && allLinks.get(i).getText().equals(expectedLinkTexts[i]))
            System.out.println(expectedLinkTexts[i] + " validation is PASSED");
            else System.out.println(expectedLinkTexts[i] + " validation is FAILED");
        }

        /*
        WebElement advertising = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[1]"));
        WebElement business = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[2]"));
        WebElement howSearchWorks = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']/a[3]"));

        if(advertising.isDisplayed() && advertising.isEnabled() && advertising.getText().equals("Advertising")){
            System.out.println("Advertising link validation is PASSED");
        } else System.out.println("Advertising link validation is FAILED");

        if(business.isDisplayed() && business.isEnabled() && business.getText().equals("Business")){
            System.out.println("Business link validation is PASSED");
        } else System.out.println("Business link validation is FAILED");

        if(howSearchWorks.isDisplayed() && howSearchWorks.isEnabled() && howSearchWorks.getText().equals("How Search works")){
            System.out.println("HowSearch link validation is PASSED");
        } else System.out.println("HowSearch link validation is FAILED");

 */
        Driver.quitDriver();


    }

}
