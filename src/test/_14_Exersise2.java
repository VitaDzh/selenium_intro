package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _14_Exersise2 {
    public static void main(String[] args) throws InterruptedException {
            /*
        Go to https://www.techglobalschool.com/
        Scroll down to the bottom of the page

        Validate the Subscribe form
        Validate "Subscribe" heading2 with its text
        Validate "Stay up to date!" paragraph with its text
        Validate "Enter your first name" input box with its placeholder
        Validate "Enter your last name" input box with its placeholder
        Validate "Add your email" input box with its placeholder
        Validate "SUBSCRIBE" button with its text
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement firstNameInput = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInput = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailInput = driver.findElement(By.id("input_comp-khwb0zsz"));

        String name = "John";
        String lastName = "Doe";
        String email = "johndoe@gmail.com";

        firstNameInput.sendKeys(name);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);

        System.out.println(firstNameInput.getAttribute("value").equals(name));
        System.out.println(lastNameInput.getAttribute("value").equals(lastName));
        System.out.println(emailInput.getAttribute("value").equals(email));

        Thread.sleep(2000);
        firstNameInput.clear();
        Thread.sleep(2000);
        lastNameInput.clear();
        Thread.sleep(2000);
        emailInput.clear();

        Driver.quitDriver();




    }
}
