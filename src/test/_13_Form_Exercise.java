package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _13_Form_Exercise {
    public static void main(String[] args) {

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
        // -->  //h1[@id='firstHeading']
        WebElement heading2 = driver.findElement(By.xpath("//div[@id='comp-keehv7pd1']//span/span"));
        WebElement upToDate = driver.findElement(By.xpath("//div[@id='comp-keei0711']//span/span"));
        WebElement firstNameInput = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInput = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailInput = driver.findElement(By.id("input_comp-khwb0zsz"));
        WebElement subscribeButton = driver.findElement(By.xpath("//span[text()='SUBSCRIBE']/..")); ////div[@id='comp-khwayqh22']//span

        System.out.println(heading2.getText().equals("Subscribe") ? "Form header validation PASSED" : "Form header validation FAILED");
        System.out.println(upToDate.getText().equals("Stay up to date!") ? "Form desc validation PASSED" : "Form desc validation FAILED");
        System.out.println(firstNameInput.getAttribute("placeholder").equals("Enter your first name") ? "First name input box validation PASSED" : "First name input box validation FAILED");
        System.out.println(lastNameInput.getAttribute("placeholder").equals("Enter your last name") ? "Last name input box validation PASSED" : "Last name input box validation FAILED");
        System.out.println(emailInput.getAttribute("placeholder").equals("Add your email") ? "Email input box validation PASSED" : "Email input box validation FAILED");
        System.out.println(subscribeButton.isDisplayed() && subscribeButton.isEnabled() && subscribeButton.getText().equals("SUBSCRIBE") ? "Subscribe button validation PASSED" : "Subscribe button validation FAILED");

        Driver.quitDriver();
    }
}
