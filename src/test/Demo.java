package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //1. to set up driver to be able to connect to Chrome code
        System.setProperty("webdriver.chrome.driver", "/Users/vitayuzko/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver(); // Instantiate ChromeBrowser --> new browser window
        //So, to instantiate ChromeDriver instance, we are using Polymorphism as ChromeDriver is a child
        // to WebDriver and in the shape of WebDriver. We are also using Abstraction as WebDriver is an interface.
        // Also, since ChromeDriver is a child to WebDriver, there is inheritance

        //2. Maximize driver/browser
        driver.manage().window().maximize(); // whole screen option, to make sure all web elements showed up

        //3. Implement some waits (cause java code is much faster than selenium). Implicit waits
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // whenever u find it do not wait.

        //4. Navigate to the webpage
        driver.get("https://www.google.com");

        //5. Validate the title
       if(driver.getTitle().equals("Google")) System.out.println("Google title validation PAssed");
       else System.out.println("FAILED");
        System.out.println("End of the program");

        //6.Quit driver. After each test u want to make sure u quit driver
        Thread.sleep(3000); // for Demo meeting to show
        driver.quit();

        //NOTE:All the implicit, explicit and fluent waits from Selenium jars are used to synchronize driver with soutce code






    }
}
