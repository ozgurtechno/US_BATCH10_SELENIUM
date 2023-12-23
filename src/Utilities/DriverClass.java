package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverClass {

    public static WebDriver getDriver(){
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Waits for 15 seconds to all elements on the page are in HTML code
        // If they are not loaded in 15 seconds it throws an exception
        // That means your application is not compatible with the browser you are using.

        //TODO We are not done yet. We will continue this method



        return driver;
    }
}
