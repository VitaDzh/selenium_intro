package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _05_Locator_id {
    /*

     */
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.techglobalschool.com/");

        WebElement techGLogo = driver.findElement(By.id("img_comp-kuiqjide2"));
        if(techGLogo.isDisplayed()) System.out.println("Passed");
        else System.out.println("FAILED");

        //Teardown
        WebElement companyName = driver.findElement(By.id("comp-kuiqjidf"));
        if(companyName.isDisplayed()) System.out.println("NAme is Passed");
        else System.out.println("Name is FAILED");


        WebElement companyText = driver.findElement(By.id("comp-kuiqjidf1"));
        if(companyText.isDisplayed() && companyText.getText().equals("U are great")) System.out.println("Text is Passed");
        else System.out.println("Text is FAILED");

        System.out.println(companyName.getText().equals("TechGlobal"));
        System.out.println(companyText.getText());
        Driver.quitDriver();




    }



}
