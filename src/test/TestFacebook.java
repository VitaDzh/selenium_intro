package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestFacebook {
    public static void main(String[] args) {
        /*
        Go to https://www.facebook.com/
        Validate the title of the page is “Facebook - Log In or Sign Up”
        Validate the URL of the page is “https://www.facebook.com/”
        Validate “facebook” logo is displayed
        Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
        Validate “Email or Phone Number” input box is displayed
        Validate “Password” input box is displayed
        Validate “Log In” button is displayed and enabled
        Validate “Forgot Password?” link is displayed
        Validate “Create New Account” button is displayed
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.facebook.com/");

        System.out.println(driver.getTitle().equals("Facebook - log in or sign up") ? "Title validation is PASSED" : "Title validation is FAILED");

        System.out.println(driver.getCurrentUrl().equals("https://www.facebook.com/") ? "URL validation is PASSED" : "URL validation is FAILED");

        WebElement logo = driver.findElement(By.className("_8ice"));
        System.out.println(logo.isDisplayed() ? "Logo validation is PASSED" : "Logo validation is FAILED");

        WebElement heading2 = driver.findElement(By.className("_8eso"));
        System.out.println(heading2.isDisplayed() ? "Heading1 validation is PASSED" : "Heading1 validation is FAILED");

        WebElement emailInputBox = driver.findElement(By.id("email"));
        System.out.println(emailInputBox.isDisplayed() ? "EmailInputBox validation is PASSED" : "EmailInputBox validation is FAILED" );

        WebElement passwordInputBox = driver.findElement(By.id("pass"));
        System.out.println(passwordInputBox.isDisplayed() ? "PasswordInputBox validation is PASSED" : "PasswordInputBox validation is FAILED");

        WebElement logInButton = driver.findElement(By.cssSelector("button[value='1']"));
        System.out.println(logInButton.isDisplayed() && logInButton.isEnabled() ? "Login button validation is PASSED" : "Login button validation is FAILED" );

        WebElement forgotPassLink = driver.findElement(By.linkText("Forgot password?"));
        System.out.println(forgotPassLink.isDisplayed() ? "ForgotPassword link validation is PASSED" : "ForgotPassword link validation is FAILED");

        WebElement createAcc = driver.findElement(By.cssSelector("a[role='button']"));
        System.out.println(createAcc.isDisplayed() ? "CreateAccountBut validation is PASSED" : "CreateAccountBut validation is FAILED" );
        //XPath --> tagName[@attributeName=’value’]
        //CssSelector --> tagName[att=‘value’]

        System.out.println("getText method - " + heading2.getText());
        System.out.println("getTagName method - " + heading2.getTagName());
        System.out.println("getCssValue method - " + heading2.getCssValue("role"));
        System.out.println("getSize method - " + heading2.getSize());

        Driver.quitDriver();






    }
}
